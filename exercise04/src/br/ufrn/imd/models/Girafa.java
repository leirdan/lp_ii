package br.ufrn.imd.models;

public class Girafa extends Animal {
    private int tamanhoLingua;

    public Girafa() {
        super();
    }

    public int getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(int tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
    }

    @Override
    public boolean precisaConsultar() {
        return calcularIdade() % 5 == 0;
    }

    @Override
    public void comer() {
        quantidadeAlimento += (peso * 0.1);
        alimentado = true;
    }
}
