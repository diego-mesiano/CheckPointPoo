package Cadastro;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private  String telefone;
    private String email;
    private Sexo sexo;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String telefone, String email, Sexo sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
