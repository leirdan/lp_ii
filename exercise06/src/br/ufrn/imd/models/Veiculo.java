package br.ufrn.imd.models;

public abstract class Veiculo {
    private final double VALOR_COMBUSTIVEL = 6.09;

    protected int quilometragemMensal;

    public int getQuilometragemMensal() {
        return quilometragemMensal;
    }
    public void setQuilometragemMensal(int quilometragemMensal) {
        this.quilometragemMensal = quilometragemMensal;
    }

    protected double getCustoMensalComCombustivel() {
        return quilometragemMensal * VALOR_COMBUSTIVEL;
    }
}
