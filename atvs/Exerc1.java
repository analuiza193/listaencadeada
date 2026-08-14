package atvs;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
