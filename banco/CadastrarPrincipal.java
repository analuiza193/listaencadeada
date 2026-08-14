package banco;

import java.util.Arrays;

public class CadastrarPrincipal {

    Conta[] contas = new Conta[3];

    int totalDeElementos = 0; 

    public void adicionaConta(Conta conta){
        contas[totalDeElementos]= conta;
        totalDeElementos ++;

    }
    public void listarConta(){
        System.out.println(Arrays.toString(contas));
    }

    public Conta procurarConta(String nome){
        for(int i = 0; i < totalDeElementos; i++){
            if (contas[i].getNome().equals(nome)) {
                return contas[i];
                       
            }
        }
        return null;
    } 
    
    public void adicionarPorposição(Conta conta) {
        int posicao = 0;
        for(int cont= totalDeElementos - 1;cont >= posicao; cont--){
            contas[cont+1]=contas[cont];
        }
        contas[posicao]= conta;
        totalDeElementos++;
    }
}
