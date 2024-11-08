package imd.view;

import imd.models.Carro;
import imd.models.Moto;
import imd.models.Repositorio;
import imd.models.Veiculo;
import imd.models.enums.TipoPartida;

import java.util.ArrayList;

public class LocaLisa {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        preencherListaVeiculos(lista);

        Repositorio repo = new Repositorio();
        repo.addVeiculosList(lista);

        System.out.println("Início do programa...");

        System.out.println(repo.listarTodosOsVeiculos());
        System.out.println(repo.listarVeiculosAlugados());
        System.out.println(repo.listarVeiculosDisponiveis());
        System.out.println(repo.realizarManutencao());

        System.out.println("Fim do programa...");

    }

    private static void preencherListaVeiculos(ArrayList<Veiculo> veiculos) {
        Carro c1 = new Carro();
        c1.setAlugado(true);
        c1.setMarca("Ford");
        c1.setPlaca("AAA-8888");
        c1.setPortas(4);
        c1.setPotencia(1600);
        c1.setValorAluguel(5 * 115.5);
        c1.setQuilometragem(21000);

        Carro c2 = new Carro();
        c2.setAlugado(true);
        c2.setMarca("Fiat");
        c2.setPlaca("ABB-1000");
        c2.setPortas(4);
        c2.setPotencia(1000);
        c2.setValorAluguel(3 * 75.0);
        c2.setQuilometragem(15000);

        Carro c3 = new Carro();
        c3.setAlugado(false);
        c3.setMarca("Fiat");
        c3.setPlaca("ABC-5501");
        c3.setPortas(2);
        c3.setPotencia(1200);
        c3.setValorAluguel(1 * 75.0);
        c3.setQuilometragem(14000);

        Moto m1 = new Moto();
        m1.setAlugado(false);
        m1.setMarca("Honda");
        m1.setPlaca("BBB-2019");
        m1.setCilindradas(850);
        m1.setPartida(TipoPartida.ELETRICA);
        m1.setValorAluguel(1 * 55.25);
        m1.setQuilometragem(3500);

        Moto m2 = new Moto();
        m2.setAlugado(true);
        m2.setMarca("Yamaha");
        m2.setPlaca("XYZ-2019");
        m2.setCilindradas(250);
        m2.setPartida(TipoPartida.ELETRICA);
        m2.setValorAluguel(2 * 55.25);
        m2.setQuilometragem(4500);

        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(m1);
        veiculos.add(m2);
    }
}
