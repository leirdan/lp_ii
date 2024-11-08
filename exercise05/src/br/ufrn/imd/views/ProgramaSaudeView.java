package br.ufrn.imd.views;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.models.Homem;
import br.ufrn.imd.models.Mulher;
import br.ufrn.imd.models.Pessoa;

public class ProgramaSaudeView {
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        init(repo);
        repo.listarPessoas();
    }

    public static void init(Repositorio repo) {
        Pessoa p1 = new Homem();
        p1.setNome("Zé Lezin");
        p1.setAltura(1.75);
        p1.setPeso(74.8);
        p1.setDataNascimento("20/01/1945");

        Pessoa p2 = new Mulher();
        p2.setNome("Frida Kahlo");
        p2.setAltura(1.69);
        p2.setPeso(50.2);
        p2.setDataNascimento("06/07/1907");

        repo.adicionarPessoa(p1);
        repo.adicionarPessoa(p2);
    }
}
