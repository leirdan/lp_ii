package br.ufrn.imd.dao;

import br.ufrn.imd.models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooDAO {
    private ArrayList<Animal> animais;

    public ZooDAO(ArrayList<Animal> animais){
        this.animais = animais;
    }

    public String getInformacoesDeAnimais() {
        String msg = "*********\n";
        for (var animal : animais) {
            msg += ("Nome: " + animal.getNome() +
                    "  Alimentacao: " + animal.getTipoAlimentacao());
            msg += "\n";
            msg += ("Peso: " + animal.getPeso() +
                    "  Idade: " + animal.calcularIdade() +
                    "  Alimentado: " + animal.isAlimentado() + "\n");
        }
        msg += "********\n";
        return msg;
    }

    public String getQuantidadeDeAlimentoGasto() {
        String msg = "********* ALIMENTAÇÂO *********\n";
        double carne = 0.0;
        double vegetais = 0.0;

        for (var animal : animais) {
            msg += "***************************\n";
            animal.comer();
            msg += ("Animal " + animal.getNome() + " se alimentou de " + animal.getQuantidadeAlimento() + " quilos.\n");
            msg += "***************************\n";
            if (animal.getTipoAlimentacao() == TipoAlimentacao.CARNE) {
                carne += animal.getQuantidadeAlimento();
            } else {
                vegetais += animal.getQuantidadeAlimento();
            }
        }
        msg += "***************************\n";
        msg += "Alimento total usado (kg): " + (carne + vegetais) + "\n";
        msg += "Frutas e legumes: " + vegetais + "\n";
        msg += "Carne: " + carne + "\n";
        msg += "***************************\n";
        return msg;

    }

    public String consultarAnimais() {
        String msg = "********* CONSULTAS *********\n";
        for (var animal : animais) {
            if (animal.precisaConsultar()) {
                msg += (animal.getClass().getSimpleName() + " - " + animal.getNome() + " foi consultado!\n");
            }
        }
        msg += "***************************\n";
        return msg;
    }

    public String getAnimaisPorIdade() {
        String msg = "********* ANIMAIS POR IDADE *********\n";

        var elefantesArray = animais.stream().filter(p -> p.getClass() == Elefante.class).collect(Collectors.toList());
        var tigresArray = animais.stream().filter(p -> p.getClass() == Tigre.class).collect(Collectors.toList());
        var girafasArray = animais.stream().filter(p -> p.getClass() == Girafa.class).collect(Collectors.toList());

        Animal elefanteMaisNovo = getAnimalPorIdade(elefantesArray, true);
        Animal elefanteMaisVelho = getAnimalPorIdade(elefantesArray, false);
        msg += "Elefante com menor idade: " + elefanteMaisNovo.getNome() + " [" + elefanteMaisNovo.calcularIdade() + "]\n";
        msg += "Elefante com maior idade: " + elefanteMaisVelho.getNome() + " [" + elefanteMaisVelho.calcularIdade() + "]\n";

        Animal tigreMaisNovo = getAnimalPorIdade(tigresArray, true);
        Animal tigreMaisVelho = getAnimalPorIdade(tigresArray, false);
        msg += "Tigre com menor idade: " + tigreMaisNovo.getNome() + " [" + tigreMaisNovo.calcularIdade() + "]\n";
        msg += "Tigre com maior idade: " + tigreMaisVelho.getNome() + " [" + tigreMaisVelho.calcularIdade() + "]\n";

        Animal girafaMaisNova = getAnimalPorIdade(girafasArray, true);
        Animal girafaMaisVelha = getAnimalPorIdade(girafasArray, false);
        msg += "Tigre com menor idade: " + girafaMaisNova.getNome() + " [" + girafaMaisNova.calcularIdade() + "]\n";
        msg += "Tigre com maior idade: " + girafaMaisVelha.getNome() + " [" + girafaMaisVelha.calcularIdade() + "]\n";

        msg += "***************************\n";

        return msg;
    }

    private Animal getAnimalPorIdade(List<Animal> animaisArray, boolean maisNovo) {
        if (maisNovo) {
            return animaisArray.stream().sorted(Comparator.comparingInt(Animal::calcularIdade)).findFirst().get();
        } else {
            return animaisArray.stream().sorted((t1, t2) -> t2.calcularIdade() - t1.calcularIdade()).findFirst().get();
        }
    }
}
