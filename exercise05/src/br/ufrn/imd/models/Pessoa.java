package br.ufrn.imd.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected double altura;

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
        var format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataNascimento = format.parse(dataNascimento);
        } catch (ParseException ex) {
            System.out.println("Error while parsing date: " + ex.getMessage());
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract String calcularImc();

    public String toString() {
        var sdf = new SimpleDateFormat("dd/MM/yyyy");
        String msg = "";
        msg += "Nome: " + this.nome + "\n";
        msg += "Data de Nascimento: " + sdf.format(this.dataNascimento) + "\n";
        msg += "Peso: " + this.peso + "\n";
        msg += "Altura: " + this.altura + "\n";

        return msg;
    }

}
