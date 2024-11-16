package br.ufrn.imd.models;

public class Carro extends Veiculo implements ICarbonFootprint {
    private double motor;

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public double getCarbonFootprint() {
        double carbono = 0;
        if (motor > 2) {
            carbono = quilometragemMensal * 1.85;
        }
        else if (motor < 1) {
            carbono = quilometragemMensal * 0.13;
        }
        else {
            carbono = quilometragemMensal * 1.22;
        }

        return carbono;
    }
}
