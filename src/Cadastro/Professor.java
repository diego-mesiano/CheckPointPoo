package Cadastro;

import java.util.List;

public class Professor extends Pessoa {
    private int id;
    private double valorHora;
    protected List<Formacao> formacao;
    protected List<Sala> sala;

    public Professor(int id, String nome, String cpf, String telefone, String email, Sexo sexo, Endereco endereco, double valorHora, List<Formacao> formacao, List<Sala> sala) {
        super(nome, cpf, telefone, email, sexo, endereco);
        this.id = id;
        this.valorHora = valorHora;
        this.formacao = formacao;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public List<Formacao> getFormacao() {
        return formacao;
    }

    public void setFormacao(List<Formacao> formacao) {
        this.formacao = formacao;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }
}

