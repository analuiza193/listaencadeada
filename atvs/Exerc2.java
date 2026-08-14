package atvs;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Calculadora calc = new Calculadora();

        System.out.println("Soma = " + calc.somar(numeros));

        sc.close();
    }
}
