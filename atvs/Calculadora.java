package atvs;

public class Calculadora {
    public int somar(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return soma;
    }
}
