package atvs;

import java.util.ArrayList;

public class Exerc3 {
    public static int[] intersecao(int[] vetor1, int[] vetor2) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {

                if (vetor1[i] == vetor2[j]) {

                    if (!lista.contains(vetor1[i])) {
                        lista.add(vetor1[i]);
                    }
                }
            }
        }

        int[] resultado = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;
    }

    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {3, 4, 5, 6, 7};

        int[] resultado = intersecao(v1, v2);

        System.out.println("Interseção:");

        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }
}
