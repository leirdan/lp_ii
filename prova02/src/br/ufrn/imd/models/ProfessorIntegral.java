package br.ufrn.imd.models;

import java.util.Date;

public class ProfessorIntegral extends Professor {
    private Date dataInicio;

    public ProfessorIntegral(String nome, String matricula, Date dataNasc, double salario, String nivelEscolaridade, String disciplina, Date dataInicio) {
        super(nome, matricula, dataNasc, salario, nivelEscolaridade, disciplina);
        this.dataInicio = dataInicio;
    }

    public ProfessorIntegral() {
        super();
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
}
