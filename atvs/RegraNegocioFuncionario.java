package atvs;

import java.util.ArrayList;

public class RegraNegocioFuncionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionario() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void adicionarPorPosicao(int pos, Funcionario f) {
        funcionarios.add(pos, f);
    }

    public void removerPorPosicao(int pos) {
        funcionarios.remove(pos);
    }

    public Funcionario procurar(String cpf) {

        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }

        return null;
    }

    public void aumentarVetor() {
        System.out.println("ArrayList cresce automaticamente.");
    }
}
