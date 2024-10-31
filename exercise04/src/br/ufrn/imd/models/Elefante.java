package br.ufrn.imd.models;

public class Elefante extends Animal {
    private int tamanhoTromba;

    public Elefante() {
        super();
    }

    public int getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    @Override
    public void comer() {
        quantidadeAlimento += (peso * 0.15);
        alimentado = true;
    }

    @Override
    public boolean precisaConsultar() {
        return calcularIdade() % 7 == 0;
    }
}
