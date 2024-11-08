package imd.models;

public class Veiculo {
    private String marca;
    private String placa;
    private boolean isAlugado;
    private double quilometragem;
    private double valorAluguel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
