package br.ufrn.imd.models;

import java.util.Date;

public class ProfessorHorista extends Professor {
    private int horasTrabalhadas;

    public ProfessorHorista(String nome, String matricula, Date dataNasc, double salario, String nivelEscolaridade, String disciplina, int horasTrabalhadas) {
        super(nome, matricula, dataNasc, salario, nivelEscolaridade, disciplina);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public ProfessorHorista() {
        super();
    }

    @Override
    public void setSalario(double horasTrabalhadas) {
        this.salario = VALOR_HORA * horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public int lecionarTurmas() {
        return 4;
    }
}
