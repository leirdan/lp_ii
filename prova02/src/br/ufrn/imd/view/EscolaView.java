package br.ufrn.imd.view;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.models.Professor;
import br.ufrn.imd.models.ProfessorHorista;
import br.ufrn.imd.models.ProfessorIntegral;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EscolaView {
    public static void main (String args[]) throws ParseException {
        ArrayList<Professor> professores = new ArrayList<>();
        Repositorio repo = new Repositorio();
        initialize(professores);

        System.out.println("Adicionando professores... ");
        professores.forEach(repo::adicionarProfessor);

        repo.listarProfessores();
        repo.listarProfessorComMaiorSalario();
        repo.listarProfessorMaisJovem();
        repo.listarSalariosPagos();
        repo.listarMediaHorasTrabalhadas();
        repo.listarProfessoresPortuguesMatematica();
        repo.listarProfessoresComMestradoDoutorado();

        System.out.println("Removendo professores...");
        professores.forEach(repo::removerProfessor);
        repo.listarProfessores();
    }

    public static void initialize(ArrayList<Professor> professores) throws ParseException {
        Date dt, dt2, dtdt2;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        ProfessorHorista prof1 = new ProfessorHorista();
        prof1.setMatricula("20150234");
        prof1.setNome("Joao Fernandes Silva");
        dt = formato.parse("16-06-1975");
        prof1.setDataNascimento(dt);
        prof1.setHorasTrabalhadas(200);
        prof1.setSalario(prof1.getHorasTrabalhadas());
        prof1.setDisciplina("Portugues");
        prof1.setNivelEscolaridade("Mestrado");
        ProfessorIntegral prof2 = new ProfessorIntegral();
        dt = formato.parse("05-02-2001");
        prof2.setDataNascimento(dt);
        dt2 = formato.parse("15-10-2019");
        prof2.setDataInicio(dt2);
        prof2.setMatricula("20110001");
        prof2.setNome("Francisco Silva Lopes");
        prof2.setSalario(4800);
        prof2.setDisciplina("Fisica");
        prof2.setNivelEscolaridade("Doutorado");
        ProfessorHorista prof3 = new ProfessorHorista();
        dt = formato.parse("05-03-1999");
        prof3.setDataNascimento(dt);
        prof3.setMatricula("20161254");
        prof3.setNome("Maria das Virtudes");
        prof3.setHorasTrabalhadas(150);
        prof3.setSalario(prof3.getHorasTrabalhadas());
        prof3.setDisciplina("Matematica");
        prof3.setNivelEscolaridade("Mestrado");
        ProfessorIntegral prof4 = new ProfessorIntegral();
        dtdt2 = formato.parse("30-09-2015");
        prof4.setDataNascimento(dt);
        prof4.setDataInicio(dt2);
        prof4.setMatricula("20180102");
        prof4.setNome("Ana Maria dos Santos");
        prof4.setSalario(4800);
        prof4.setDisciplina("Portugues");
        prof4.setNivelEscolaridade("Mestrado");
        ProfessorIntegral prof5 = new ProfessorIntegral();
        dt = formato.parse("25-05-1971");
        dt2 = formato.parse("25-05-2018");
        prof5.setDataNascimento(dt);
        prof5.setDataInicio(dt2);
        prof5.setMatricula("19800001");
        prof5.setNome("Raimundo Chico Nonato");
        prof5.setSalario(11500);
        prof5.setDisciplina("Biologia");
        prof5.setNivelEscolaridade("Doutorado");

        professores.add(prof1);
        professores.add(prof2);
        professores.add(prof3);
        professores.add(prof4);
        professores.add(prof5);
    }
}
