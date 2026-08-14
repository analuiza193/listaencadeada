public class Paciente {
    private String rg;
    private String nome;
    private double idade;

    
    public Paciente(String rg, String nome, double idade) {
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getIdade() {
        return idade;
    }


    public void setIdade(double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "RG = " + rg + " /  Nome = " + nome + " /  Idade = " + idade ;
    }
}
