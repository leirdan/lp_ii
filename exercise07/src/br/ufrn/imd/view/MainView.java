package br.ufrn.imd.view;

import br.ufrn.imd.models.CollectionRepository;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class MainView {
    public static void main(String[] args) {
        CollectionRepository collectionRepo = new CollectionRepository();

        Set<String> toDoSet = new HashSet<>();
        toDoSet.add("DAAL");
        toDoSet.add("BTI");

        Queue<String> actions = new ArrayDeque();
        actions.add("Attack");
        actions.add("Jump");

        collectionRepo.add("todo", toDoSet);
        collectionRepo.add("actions", actions);

        System.out.println("To do set: " + collectionRepo.get("todo"));
        System.out.println("actions queue: " + collectionRepo.get("actions"));

    }
}
