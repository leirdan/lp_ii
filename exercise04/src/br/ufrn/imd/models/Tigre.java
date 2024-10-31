package br.ufrn.imd.models;

public class Tigre extends Animal {
    private String tipoTigre;

    public Tigre() {
        super();
    }

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    @Override
    public boolean precisaConsultar() {
        return calcularIdade() % 3 == 0;
    }

    @Override
    public void comer() {
        quantidadeAlimento += (peso * 0.04);
        alimentado = true;
    }
}
