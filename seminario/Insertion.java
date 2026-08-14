package seminario;

public class Insertion {
    //Método principal do Insertion Sort
    public static void insertionSort(int[] vetor) {

        //O for percorre o vetor começando do segundo elemento
        //Aqui o algoritmo pega cada número e tenta colocá-lo na posição correta
        for (int i = 1; i < vetor.length; i++) {

            //Guarda o valor atual que será comparado
            int atual = vetor[i];

            //Variável usada para comparar os elementos anteriores
            int j = i - 1;

            //Enquanto existir elemento anterior maior que o atual
            //o programa move os elementos maiores uma posição para frente
            while (j >= 0 && vetor[j] > atual) {

                vetor[j + 1] = vetor[j];
                j--;
            }

            //Coloca o valor atual na posição correta
            vetor[j + 1] = atual;
        }
    }
    //Parte que executa o programa
    public static void main(String[] args) {

        //Vetor com os números que serão organizados
        int[] vetor = {8, 3, 5, 1};

        //Parte em que o programa organiza os elementos
        insertionSort(vetor);

        System.out.println("Vetor ordenado:");

        //Mostra o vetor já organizado
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}
