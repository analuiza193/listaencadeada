package main;

import basica.Processo;
import estrutura.Fila;

public class Principal {
    public static void main(String[] args) {
        Fila fila= new Fila(5);

        Processo p1= new Processo(1, "PDF1");
        Processo p2= new Processo(2, "PDF2");
        Processo p3= new Processo(3, "PDF3");

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);
        fila.mostrar();

        System.out.println("\nPrimeiro processo da fila: ");
        System.out.println(fila.verificar());

        System.out.println("\nRemovendo processo: ");
        System.out.println(fila.remover());

        fila.mostrar();


    }
}
