package aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.test;

import aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.Aluno;
import aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.Professor;
import aulasJavaFiap.aula1.Projeto1GerenciamentoEscolar.dominio.service.Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoDeEscola {

    public static String obterEntrada(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        return sc.nextLine().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Gerenciamento gerenciamento = new Gerenciamento();

        while (true){
            System.out.println("----------------------------------");
            System.out.println("Olá, Bem vindo ao ManagerSchool");
            System.out.println("----------------------------------");
            System.out.println(" 1. Cadastrar Aluno \n 2.Cadastrar Professor \n 3. Listar Alunos \n 4. Listar Professores \n 5. Alterar nome aluno por ID \n 6. Remover Aluno \n 7. Remover Professor \n 8. Procurar Aluno por Nome \n 9.Fazer Chamada \n 10. Sair");
            System.out.print("Escolha uma opção : ");
            int opcao = sc.nextInt();
            if(opcao == 10){
                System.out.println("----------------------------------");
                System.out.println("Obrigado por usar o ManagerSchool");
                System.out.println("----------------------------------");
                break;
            }else{
                switch (opcao){
                    case 1:
                        System.out.println("Cadastrar Aluno");
                        System.out.println("----------------------------------");

                        String nome = obterEntrada("Nome do aluno: ");
                        String curso = obterEntrada("Curso do aluno: ");

                        if (nome.isEmpty() || curso.isEmpty()) {
                            System.out.println("Nome e curso não podem ser vazios!");
                        } else {
                            Aluno aluno = new Aluno(nome, curso);
                            alunos.add(aluno);
                            System.out.println("Aluno cadastrado com sucesso!");
                        }
                        break;
                    case 2:
                        System.out.println("Cadastrar Professor");
                        System.out.println("----------------------------------");

                        String nomeProfessor = obterEntrada("Nome do Professor: ");
                        String materiaProfessor = obterEntrada("Matéria lecionada pelo professor: ");

                        if (nomeProfessor.isEmpty() || materiaProfessor.isEmpty()) {
                            System.out.println("Nome e matéria não podem ser vazios!");
                        } else {
                            Professor professor = new Professor(nomeProfessor,materiaProfessor);
                            professores.add(professor);
                            System.out.println("Professor cadastrado com sucesso!");
                        }
                        break;
                    case 3:
                        System.out.println("Listar Alunos");
                        System.out.println("----------------------------------");
                        gerenciamento.listarAluno(alunos);

                        break;
                    case 4:
                        System.out.println("Listar Professores");
                        System.out.println("----------------------------------");
                        gerenciamento.listarProfessores(professores);
                        break;
                    case 5:
                        System.out.println("Alterar o nome do Aluno por ID");
                        System.out.println("----------------------------------");
                        String idAluno = obterEntrada("Digite o ID do aluno que deseja alterar o nome: ");
                        String novoNome = obterEntrada("Digite o novo nome do aluno: ");
                        if(idAluno.isEmpty() || novoNome.isEmpty()){
                            System.out.println("Não pode estar em branco !");
                        }else{
                            gerenciamento.alterarNomePorId(idAluno,novoNome,alunos);
                        }
                        break;
                    case 6:
                        System.out.println("Remover Aluno");
                        System.out.println("----------------------------------");
                        String nomeAlunoRemover = obterEntrada("Digite o nome do aluno para ser removido: ");
                        if(nomeAlunoRemover.isEmpty()){
                            System.out.println("Não foi possivel concluir !");
                        }else{
                            gerenciamento.removerAlunoPorNome(nomeAlunoRemover,alunos);
                        }
                        break;
                    case 7:
                        System.out.println("Remover Professor");
                        System.out.println("----------------------------------");

                        String nomeProfessorRemover = obterEntrada("Digite o nome do professor para ser removido: ");
                        if(nomeProfessorRemover.isEmpty()){
                            System.out.println("Não foi possivel concluir !");
                        }else{
                            gerenciamento.removerProfessorPorNome(nomeProfessorRemover,professores);
                        }
                        break;
                    case 8:
                        System.out.println("Procurar Aluno por Nome");
                        System.out.println("----------------------------------");
                        String nomeAlunoProcurar = obterEntrada("Digite o nome do aluno para ser procurado: ");
                        if(nomeAlunoProcurar.isEmpty()){
                            System.out.println("Não foi possivel concluir !");
                        }else{
                            gerenciamento.procurarAlunoPorNome(nomeAlunoProcurar,alunos);
                        }
                        break;
                    case 9:
                        System.out.println("Fazer Chamada");
                        System.out.println("----------------------------------");
                        gerenciamento.chamadaAlunos(alunos);
                        break;
                }
            }
        }

    }
}
