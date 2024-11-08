package br.ufrn.imd.models;

import java.util.Date;

public class Professor {
    protected String nome;
    protected String matricula;
    protected Date dataNascimento;
    protected double salario;
    protected String nivelEscolaridade;
    protected String disciplina;
    protected final double VALOR_HORA = 55.0;

    protected Professor(String nome, String matricula, Date dataNascimento, double salario, String nivelEscolaridade, String disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.nivelEscolaridade = nivelEscolaridade;
        this.disciplina = disciplina;
    }

    protected Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int lecionarTurmas() {
        switch (nivelEscolaridade.toLowerCase()) {
            case "mestrado": return 2;
            case "doutorado": return 1;
            case "especializacao":
            default:
                return 3;
        }
    }
}
