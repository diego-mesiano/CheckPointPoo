package Cadastro;

public class Endereco {
    private String Logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String estado) {
        Logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
