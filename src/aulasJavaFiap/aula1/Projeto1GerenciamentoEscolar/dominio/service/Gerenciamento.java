package aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.service;

import aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.Aluno;
import aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciamento {


    public void listarAluno(List<Aluno> alunos){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado !");
        }else{
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void listarProfessores(List<Professor> professores){
        if(professores.isEmpty()){
            System.out.println("Nenhum professor encontrado !");
        }else{
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }
    }

    public Aluno procurarAlunoPorNome(String nome, List<Aluno> alunos) {
        return alunos.stream()
                .filter(aluno -> aluno.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Nenhum aluno encontrado com o nome: " + nome);
                    return null;
                });
    }

    public boolean removerAlunoPorNome(String nome, List<Aluno> alunos) {
        return alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
    }

    public boolean removerProfessorPorNome(String nome, List<Professor> professores){
        return professores.removeIf(professor -> professor.getNome().equalsIgnoreCase(nome));
    }

    public boolean alterarNomePorId(String id, String novoNome, List<Aluno> alunos){
        for(Aluno aluno : alunos){
            if(aluno.getId().equals(id)){
                aluno.setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public List<Aluno> chamadaAlunos(List<Aluno> alunos){
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunosPresentes = new ArrayList<>();
        for (Aluno aluno : alunos) {
            System.out.println("Aluno -> " + aluno.getNome());
            System.out.println("Está Presente ? (sim/não) -> ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                alunosPresentes.add(aluno);
            }
        }
        System.out.println("Alunos presentes: ");
        for (Aluno aluno : alunosPresentes) {
            System.out.println(aluno.getNome());
        }

        return alunosPresentes;

    }

}
