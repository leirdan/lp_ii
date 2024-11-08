package imd.models;

import imd.models.enums.TipoPartida;

public class Moto extends Veiculo {
    private double cilindradas;
    private TipoPartida partida;

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public TipoPartida getPartida() {
        return partida;
    }

    public void setPartida(TipoPartida partida) {
        this.partida = partida;
    }
}
