package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoNaoDuravel extends Produto {
    private Date dataValidade;
    private String genero;

    public ProdutoNaoDuravel(String nome, String marca, double preco, String descricao, String genero, Date dataValidade) {
        super(nome, marca, preco, descricao);
        this.genero = genero;
        this.dataValidade = dataValidade;
    }

    public ProdutoNaoDuravel(String nome, String marca, double preco, String descricao, String genero, String dataValidade) {
        super(nome, marca, preco, descricao);
        this.genero = genero;
        try {
            this.dataValidade = new SimpleDateFormat("dd-MM-yyyy").parse(dataValidade);
        } catch (ParseException e) {
            throw new RuntimeException("Erro ao cadastrar data de validade do produto. Tente novamente.");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
