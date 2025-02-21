package aulasJavaFiap.aula1.dominio;

import java.util.UUID;

public class Aluno {
    private String nome;
    private String id;
    private String curso;

    public Aluno(String nome, String id, String curso) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
