package br.ufrn.imd.models;

public class Moto extends Veiculo implements ICarbonFootprint {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = 0;
        if (cilindradas > 650) {
            carbono = quilometragemMensal * 0.65;
        }
        else if (cilindradas < 150) {
            carbono = quilometragemMensal * 0.20;
        }
        else {
            carbono = quilometragemMensal * 0.50;
        }

        return carbono;
    }
}
