package br.ufrn.imd.views;

import br.ufrn.imd.dao.ZooDAO;
import br.ufrn.imd.models.*;

import java.util.ArrayList;

public class ZooView {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        initialize(animais);

        ZooDAO dao = new ZooDAO(animais);

        System.out.println(dao.getInformacoesDeAnimais());
        System.out.println(dao.getQuantidadeDeAlimentoGasto());
        System.out.println(dao.consultarAnimais());
        System.out.println(dao.getAnimaisPorIdade());
        System.out.println(dao.getInformacoesDeAnimais());
    }

    public static void initialize(ArrayList<Animal> animais) {
        Animal a1 = new Tigre();
        a1.setNome("Simba");
        a1.setTipoAlimentacao(TipoAlimentacao.CARNE);
        a1.setPeso(350);
        a1.setDataNascimento("18-09-1980");

        Animal a2 = new Tigre();
        a2.setNome("Kairos");
        a2.setTipoAlimentacao(TipoAlimentacao.CARNE);
        a2.setPeso(300);
        a2.setDataNascimento("18-09-1984");

        Animal a3 = new Elefante();
        a3.setNome("Cristal");
        a3.setTipoAlimentacao(TipoAlimentacao.VERDURAS_E_LEGUMES);
        a3.setPeso(500);
        a3.setDataNascimento("18-09-2021");

        Animal a4 = new Elefante();
        a4.setNome("Dumbo");
        a4.setTipoAlimentacao(TipoAlimentacao.VERDURAS_E_LEGUMES);
        a4.setPeso(750);
        a4.setDataNascimento("18-09-2016");

        Animal a5 = new Girafa();
        a5.setNome("Rafik");
        a5.setTipoAlimentacao(TipoAlimentacao.VERDURAS_E_LEGUMES);
        a5.setPeso(550);
        a5.setDataNascimento("18-09-2007");

        Animal a6 = new Girafa();
        a6.setNome("Olivia");
        a6.setTipoAlimentacao(TipoAlimentacao.VERDURAS_E_LEGUMES);
        a6.setPeso(500);
        a6.setDataNascimento("18-09-2016");

        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        animais.add(a5);
        animais.add(a6);
    }
}
