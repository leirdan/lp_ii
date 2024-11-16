package br.ufrn.imd.views;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.models.Carro;
import br.ufrn.imd.models.Moto;
import br.ufrn.imd.models.Taxi;

public class VeiculosView {
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        init(repo);
        repo.listarQuantidadePegadasDeCarbono();
    }

    public static void init(Repositorio repositorio) {
        Carro c1 = new Carro();
        c1.setMotor(3.1);
        c1.setQuilometragemMensal(70);

        Carro c2 = new Carro();
        c2.setMotor(1.3);
        c2.setQuilometragemMensal(40);

        Moto m1 = new Moto();
        m1.setQuilometragemMensal(50);
        m1.setCilindradas(750);

        Moto m2 = new Moto();
        m2.setQuilometragemMensal(30);
        m2.setCilindradas(320);

        Taxi t1 = new Taxi();
        t1.setQuantidadePessoas(4);
        t1.setQuilometragemMensal(80);

        Taxi t2 = new Taxi();
        t2.setQuantidadePessoas(6);
        t2.setQuilometragemMensal(60);

        repositorio.adicionarVeiculo(c1);
        repositorio.adicionarVeiculo(c2);
        repositorio.adicionarVeiculo(m1);
        repositorio.adicionarVeiculo(m2);
        repositorio.adicionarVeiculo(t1);
        repositorio.adicionarVeiculo(t2);
    }
}
