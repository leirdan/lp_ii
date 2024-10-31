package br.ufrn.imd.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected boolean alimentado;
    protected TipoAlimentacao tipoAlimentacao;
    protected int quantidadeAlimento;

    public Animal() {
        alimentado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd-MM-yyyy").parse(dataNascimento);
        } catch (ParseException e){
            throw new RuntimeException(e);
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public TipoAlimentacao getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(TipoAlimentacao tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public int getQuantidadeAlimento() {
        return quantidadeAlimento;
    }

    public void setQuantidadeAlimento(int quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }

    public void comer() {
        quantidadeAlimento += (peso * 0.05);
        alimentado = true;
    }

    public boolean precisaConsultar() {
        return false;
    }

    public int calcularIdade() {
        return Date.from(Instant.now()).getYear() - dataNascimento.getYear();
    }
}
