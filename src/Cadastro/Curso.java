package Cadastro;

public class Curso {
    private String nome;
    private double mensalidade;
    private Modalidade modalidade;
    private Turno turno;

    public Curso(String nome, double mensalidade, Modalidade modalidade, Turno turno) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.modalidade = modalidade;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
