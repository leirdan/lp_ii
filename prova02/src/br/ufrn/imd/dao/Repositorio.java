package br.ufrn.imd.dao;

import br.ufrn.imd.models.Professor;
import br.ufrn.imd.models.ProfessorHorista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Repositorio {

    private ArrayList<Professor> professores;

    public Repositorio() {
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor p) {
        if (p != null)
            professores.add(p);
    }

    public void removerProfessor(Professor p) {
        if (p != null)
            professores.remove(p);
    }

    public void listarProfessores() {
        System.out.println("*********** Professores ***********");
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (var prof : this.professores) {
                System.out.println("Nome: " + prof.getNome() + "; Disciplina: " + prof.getDisciplina() + "; Turmas: " + prof.lecionarTurmas());
            }
        }
        System.out.println("************************************");
    }

    public void listarProfessorComMaiorSalario() {
        var professorComMaiorSalario = professores.get(0);
        for (var prof : professores) {
            boolean temMaiorSalario = prof.getSalario() > professorComMaiorSalario.getSalario();

            if (temMaiorSalario)
                professorComMaiorSalario = prof;
        }

        System.out.println("********** Professor com Maior Salário *********");
        System.out.println("Nome: " + professorComMaiorSalario.getNome() + "; Salário: " + professorComMaiorSalario.getSalario());
        System.out.println("************************************");
    }


    public void listarProfessorMaisJovem() {
        SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
        var professor = professores.get(0);
        for (var prof : professores) {
            boolean maisNovo = prof.getDataNascimento().compareTo(professor.getDataNascimento()) > 0;

            if (maisNovo)
                professor = prof;
        }

        System.out.println("********** Professor mais jovem *********");
        System.out.println("Nome: " + professor.getNome() + "; Dt. Nascimento: " + sdt.format(professor.getDataNascimento()));
        System.out.println("************************************");
    }

    public void listarSalariosPagos() {
        double totalSalario = 0.0;
        for (var prof : professores) {
            totalSalario += prof.getSalario();
        }
        System.out.println("*********** Total de Salários **********");
        System.out.println("Total de salários pagos: R$ " + totalSalario);
        System.out.println("************************************");
    }

    public void listarMediaHorasTrabalhadas() {
        double media = 0.0;
        double totalHoras = 0, quantidadeHoristas = 0;
        for (var prof : professores) {
            if (prof instanceof ProfessorHorista profHorista) {
                totalHoras += profHorista.getHorasTrabalhadas();
                quantidadeHoristas++;
            }
        }

        media = totalHoras / quantidadeHoristas;

        System.out.println("********** Média de horas ***********");
        System.out.println("Média dos professores horistas: " + media);
        System.out.println("************************************");
    }

    public void listarProfessoresPortuguesMatematica() {
        System.out.println("********** Professores que lecionam Portugues e Matematica *********");
        for (var prof : professores) {
            boolean atendeRequisitos = prof.getDisciplina().equalsIgnoreCase("portugues") ||
                    prof.getDisciplina().equalsIgnoreCase("matematica");

            if (atendeRequisitos) {
                System.out.println(prof.getNome() + " - " + prof.getDisciplina() + " (" + prof.getMatricula() + ")");
            }
        }
        System.out.println("************************************");
    }

    public void listarProfessoresComMestradoDoutorado() {
        System.out.println("********** Professores com Mestrado e Doutorado *********");
        for (var prof : professores) {
            boolean atendeRequisitos = prof.getNivelEscolaridade().equalsIgnoreCase("mestrado") ||
                    prof.getNivelEscolaridade().equalsIgnoreCase("doutorado");

            if (atendeRequisitos) {
                System.out.println(prof.getNome() + " - " + prof.getNivelEscolaridade() + " (" + prof.getMatricula() + ")");
            }
        }
        System.out.println("************************************");
    }
}
