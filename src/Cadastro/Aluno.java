package Cadastro;

public class Aluno extends Pessoa {
    private int id;
    private Sala sala;


    public Aluno(int id, String nome, String cpf, String telefone, String email, Sexo sexo, Endereco endereco, Sala sala) {
        super(nome, cpf, telefone, email, sexo, endereco);
        this.id = id;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
