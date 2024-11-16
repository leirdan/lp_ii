package br.ufrn.imd.dao;

import br.ufrn.imd.models.Carro;
import br.ufrn.imd.models.Moto;
import br.ufrn.imd.models.Taxi;
import br.ufrn.imd.models.Veiculo;

import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Veiculo> veiculos;

    public Repositorio() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        if (v != null)
            veiculos.add(v);
    }

    public void listarQuantidadePegadasDeCarbono() {
        System.out.println("============ PEGADAS DE CARBONO ============");
        double cfCarro = 0.0, cfMoto = 0.0, cfTaxi = 0.0;

        for (var v : veiculos) {
            if (v instanceof Carro c) {
                cfCarro += c.getCarbonFootprint();
                System.out.println(c.getClass().getSimpleName() + ": " + c.getCarbonFootprint());
            } else if (v instanceof Moto m) {
                cfMoto += m.getCarbonFootprint();
                System.out.println(m.getClass().getSimpleName() + ": " + m.getCarbonFootprint());
            } else if (v instanceof Taxi t) {
                cfTaxi += t.getCarbonFootprint();
                System.out.println(t.getClass().getSimpleName() + ": " + t.getCarbonFootprint());
            }
        }

        System.out.println("Total de pegadas de carbono em carros: " + cfCarro);
        System.out.println("Total de pegadas de carbono em motos: " + cfMoto);
        System.out.println("Total de pegadas de carbono em táxis: " + cfTaxi);
    }
}
