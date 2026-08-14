package atvs;

public class Empresa {
    private String cnpj;
    private String nome;
    private String telefone;

    public Empresa(String cnpj, String nome, String telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj +
               ", Nome: " + nome +
               ", Telefone: " + telefone;
    }
}
