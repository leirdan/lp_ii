package br.ufrn.imd.models;

public class Taxi extends Veiculo implements ICarbonFootprint {
    private int quantidadePessoas;

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getCarbonFootprint() {
        return quilometragemMensal * 1.1;
    }
}
