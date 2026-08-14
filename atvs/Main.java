package atvs;

public class Main {
    public static void main(String[] args) {

        RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();

        Empresa empresa =
                new Empresa("123456789",
                            "IFBA",
                            "87999999999");

        rne.cadastrarEmpresa(empresa);

        Funcionario funcionario =
                new Funcionario("11111111111",
                                "João",
                                "1234567",
                                "87988888888");

        rnf.cadastrarFuncionario(funcionario);

        System.out.println("EMPRESAS");
        rne.listarEmpresa();

        System.out.println("\nFUNCIONÁRIOS");
        rnf.listarFuncionario();

        System.out.println("\nBusca por CPF:");
        System.out.println(rnf.procurar("11111111111"));
    }
}
