public class Principal {
    public static void main(String[] args) {
        ColecaoPaciente cp= new ColecaoPaciente();

        cp.cadastrarPaciente(new Paciente("11634250", "Beltrano", 15));
        cp.cadastrarPaciente(new Paciente("12189372", "Luiza", 18));
        cp.cadastrarPaciente(new Paciente("13489559", "Ana", 19));
        cp.cadastrarPaciente(new Paciente("13489559", "Fulano", 19));
        cp.cadastrarPaciente(new Paciente("13489559", "Ciclano", 19));
        
        cp.listarPaciente();
        
        System.out.println("\nQuantidade: " + cp.quantidadeDePacienteCadastrado());

        System.out.println("\nMédia: " + cp.calcularMediaDeIdade());
        cp.ordenarPorNome();

        System.out.println("\n--------------");

        System.out.println("\nApós Ordenação:\n");
        cp.listarPaciente();
    }
}
