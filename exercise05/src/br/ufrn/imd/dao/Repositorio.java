package br.ufrn.imd.dao;

import br.ufrn.imd.models.Pessoa;

import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Pessoa> pessoas;

    public Repositorio() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa p) {
        if (p != null) {
            pessoas.add(p);
        }
    }

    public void removerPessoa(Pessoa p) {
        if (p != null) {
            pessoas.remove(p);
        }
    }

    public void listarPessoas() {
        System.out.println("------------------------------------------------------------------");
        for (var pessoa : pessoas) {
            System.out.print(pessoa.toString());
            System.out.println(pessoa.calcularImc());
            System.out.println("------------------------------------------------------------------");
        }
    }
}
