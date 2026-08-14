package atvs;

import java.util.ArrayList;

public class RegraNegocioEmpresa {
    private ArrayList<Empresa> empresas = new ArrayList<>();

    public void cadastrarEmpresa(Empresa e) {
        empresas.add(e);
    }

    public void listarEmpresa() {
        for (Empresa e : empresas) {
            System.out.println(e);
        }
    }

    public void adicionarPorPosicao(int pos, Empresa e) {
        empresas.add(pos, e);
    }

    public void removerPorPosicao(int pos) {
        empresas.remove(pos);
    }

    public Empresa procurar(String cnpj) {

        for (Empresa e : empresas) {
            if (e.getCnpj().equals(cnpj)) {
                return e;
            }
        }

        return null;
    }

    public void aumentarVetor() {
        System.out.println("ArrayList cresce automaticamente.");
    }
}
