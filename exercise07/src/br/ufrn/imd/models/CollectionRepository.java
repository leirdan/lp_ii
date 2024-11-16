package br.ufrn.imd.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionRepository {
    private Map<String, Collection<?>> collectionMap;

    public CollectionRepository() {
        collectionMap = new HashMap<>();
    }

    public <T> void add(String name, Collection<T> collection) {
        collectionMap.put(name, collection);
    }

    public <T> Collection<T> get(String name) {
        return (Collection<T>) collectionMap.get(name);
    }

    public void delete(String name) {
        collectionMap.remove(name);
    }
}
