package aulasJavaFiap.aula1.test;

import aulasJavaFiap.aula1.dominio.Aluno;
import aulasJavaFiap.aula1.dominio.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoDeEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

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
                        break;
                    case 2:
                        System.out.println("Cadastrar Professor");
                        System.out.println("----------------------------------");
                        break;
                    case 3:
                        System.out.println("Listar Alunos");
                        System.out.println("----------------------------------");
                        break;
                    case 4:
                        System.out.println("Listar Professores");
                        System.out.println("----------------------------------");
                        break;
                    case 5:
                        System.out.println("Alterar o nome do Aluno por ID");
                        System.out.println("----------------------------------");
                        break;
                    case 6:
                        System.out.println("Remover Aluno");
                        System.out.println("----------------------------------");
                        break;
                    case 7:
                        System.out.println("Remover Professor");
                        System.out.println("----------------------------------");
                        break;
                    case 8:
                        System.out.println("Procurar Aluno por Nome");
                        System.out.println("----------------------------------");
                        break;
                    case 9:
                        System.out.println("Fazer Chamada");
                        System.out.println("----------------------------------");
                        break;
                }
            }
        }

    }
}
