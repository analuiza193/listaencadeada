package atvs;

public class Funcionario {
    private String cpf;
    private String nome;
    private String rg;
    private String telefone;

    public Funcionario(String cpf, String nome, String rg, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf +
               ", Nome: " + nome +
               ", RG: " + rg +
               ", Telefone: " + telefone;
    }
}
