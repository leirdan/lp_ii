package models;

public class ProdutoDuravel extends Produto {
    private int durabilidadeAnos;

    public ProdutoDuravel(String nome, String marca, double preco, String descricao, int durabilidadeAnos) {
        super(nome, marca, preco, descricao);
        this.durabilidadeAnos = durabilidadeAnos;
    }

    public int getDurabilidadeAnos() {
        return durabilidadeAnos;
    }

    public void setDurabilidadeAnos(int durabilidadeAnos) {
        this.durabilidadeAnos = durabilidadeAnos;
    }
}
