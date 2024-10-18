package models;

public class Produto {
    protected String nome;
    protected String marca;
    protected double preco;
    protected String descricao;

    public Produto(String nome, String marca, double preco, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
