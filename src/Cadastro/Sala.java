package Cadastro;

public class Sala {
    private String nome;
    private Curso curso;

    public Sala(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
