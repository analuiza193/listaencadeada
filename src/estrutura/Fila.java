package estrutura;

import basica.Processo;

public class Fila {
    private Processo[] fila;
    private int inicio;
    private int fim;

    public Fila(int tamanho) {
        fila = new Processo[tamanho];
        inicio = 0;
        fim = 0;

    }

    // ADICIONAR PROCESSOR
    public void adicionar(Processo processo) {
        if (fim == fila.length) {
            System.out.println("Fila cheia");
            return;
        }
        fila[fim] = processo;
        fim++;

        System.out.println("Processo adicionado");
    }

    // REMOVERRR
    public Processo remover() {
        if (inicio == fim) {
            System.out.println("Fila vazia");
            return null;
        }
        Processo processo = fila[inicio];
        fila[inicio] = null;
        inicio++;
        return processo;
    }

    // Verificar
    public Processo verificar() {
        if (inicio == fim) {
            System.out.println("Fila vazia");
            return null;
        }
        return fila[inicio];
    }

    // mostrar
    public void mostrar() {
        if (inicio == fim) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Fila da impressora");
        for (int i = inicio; i < fim; i++) {
            System.out.println(fila[i]);
        }
    }
}
