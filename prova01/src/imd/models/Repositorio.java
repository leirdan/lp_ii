package imd.models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

public class Repositorio {
    private ArrayList<Veiculo> veiculosList;

    public Repositorio() {
        veiculosList = new ArrayList<>();
    }

    public void addVeiculo(Veiculo v) {
        veiculosList.add(v);
    }

    public void addVeiculosList(ArrayList<Veiculo> list) {
        veiculosList.addAll(list);
    }

    public String listarTodosOsVeiculos() {
        String msg = "==========Veículos==========\n";
        Map<String, Integer> frequenciaMarcas = new TreeMap<>();

        for (Veiculo v : veiculosList) {
            msg += "Veículo: ";
            msg += (v.getClass().getName() + "   ");
            msg += ("Marca: " + v.getMarca() + "   ");
            msg += ("Placa: " + v.getPlaca() + "\n");

            frequenciaMarcas.compute(v.getMarca(), (key, value) ->
                    value == null ? 1 : value + 1);
        }

        String marcaMaisRecorrente = "";
        int maiorFrequencia = 0;
        for (var entrada : frequenciaMarcas.entrySet()) {
            if (entrada.getValue() > maiorFrequencia) {
                maiorFrequencia = entrada.getValue();
                marcaMaisRecorrente = entrada.getKey();
            }
        }

        msg += ("Marca com maior numero de carros: " + marcaMaisRecorrente + "\n");
        msg += "==========Fim==========\n";
        return msg;
    }

    public String listarVeiculosAlugados() {
        String msg = "==========Alugados==========\n";
        double totalAluguel = 0.0;
        for (Veiculo v : veiculosList) {
            if (!v.isAlugado()) {
                continue;
            }
            if (v instanceof Carro) {
                var carro = (Carro) v;
                msg += ("Carro: " + carro.getMarca() + "   ");
                msg += ("Placa: " + carro.getPlaca() + "   ");
                msg += ("Motor: " + carro.getPotencia() + "   ");
                msg += ("Portas: " + carro.getPortas() + "   ");
            } else if (v instanceof Moto) {
                var moto = (Moto) v;
                msg += ("Moto: " + moto.getMarca() + "   ");
                msg += ("Placa: " + moto.getPlaca() + "   ");
                msg += ("Partida: " + moto.getPartida().toString() + "   ");
                msg += ("Cilindradas: " + moto.getCilindradas() + "   ");
            }
            totalAluguel += v.getValorAluguel();
            msg += "\n";
        }
        msg += ("Valor total dos aluguéis: " + totalAluguel + "\n");
        msg += "==========Fim==========\n";
        return msg;
    }

    public String listarVeiculosDisponiveis() {
        String msg = "==========Disponiveis==========\n";
        for (Veiculo v : veiculosList) {
            if (v.isAlugado()) {
                continue;
            }
            if (v instanceof Carro) {
                var carro = (Carro) v;
                msg += ("Carro: " + carro.getMarca() + "   ");
                msg += ("Placa: " + carro.getPlaca() + "   ");
                msg += ("Motor: " + carro.getPotencia() + "   ");
                msg += ("Portas: " + carro.getPortas() + "   ");
                msg += ("Valor aluguel: " + carro.getValorAluguel() + "   ");
            } else if (v instanceof Moto) {
                var moto = (Moto) v;
                msg += ("Moto: " + moto.getMarca() + "   ");
                msg += ("Placa: " + moto.getPlaca() + "   ");
                msg += ("Partida: " + moto.getPartida().toString() + "   ");
                msg += ("Cilindradas: " + moto.getCilindradas() + "   ");
                msg += ("Valor aluguel: " + moto.getValorAluguel() + "   ");
            }
            msg += "\n";
        }

        Optional<Veiculo> veiculoMaisCaro = veiculosList.stream()
                .sorted((v1, v2) -> (int) (v2.getValorAluguel() - v1.getValorAluguel()))
                .filter((vn) -> !vn.isAlugado())
                .findFirst();

        if (veiculoMaisCaro.isPresent()) {
            msg += ("Veículo com maior valor de aluguel: " + veiculoMaisCaro.get().getPlaca() + "\n");
        }
        msg += "==========Fim==========\n";
        return msg;
    }

    public String realizarManutencao() {
        String msg = "==========Manutenção==========\n";
        double totalOleo = 0.0;

        for (Veiculo v : veiculosList) {
            if (v instanceof Carro c && c.getQuilometragem() % 7000 == 0) {
                msg += ("Veículo: " + c.getMarca() + " trocou óleo \n");
                totalOleo += 3.5;
            } else if (v instanceof Moto m && m.getQuilometragem() % 3500 == 0) {
                msg += ("Veículo: " + m.getMarca() + " trocou óleo \n");
                totalOleo += 1.5;
            }
        }

        msg += totalOleo == 0.0
                ? "Nenhum veículo precisou de manuntenção."
                : ("Quantidade total de litros de óleo: " + totalOleo + "\n");

        msg += "==========Fim==========\n";
        return msg;
    }
}
