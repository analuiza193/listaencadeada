package seminario;

public class Heap {
    //Classe principal
    public static void heapSort(int[] notas) {

        //aqui o programa guarda a quantidade de elementos e verifica quantas notas existem para saber quantas comparações e trocas serão feitas
        int n = notas.length;

        //O for percorre o vetor reorganizando os elementos
        //Aqui o algoritmo prepara os dados, organizando-os em formato Heap, para facilitar encontrar os maiores elementos.
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(notas, n, i);
        }

        //Esse for faz a ordenação
        //Depois de criar o Heap, o programa começa a mover os maiores elementos para suas posições corretas
        for (int i = n - 1; i > 0; i--) {

            // Troca o maior elemento com o último
            //O programa pega o maior elemento, que está no topo do Heap, e troca pela última posição do vetor
            int temp = notas[0];
            notas[0] = notas[i];
            notas[i] = temp;

            // Reorganiza o Heap
            heapify(notas, i, 0);
        }
    }

    //O método heapify reorganiza os elementos para manter a estrutura Heap funcionando corretamente
    public static void heapify(int[] notas, int n, int i) {

        //O Heap funciona parecido com uma árvore binária, então o algoritmo verifica os elementos filhos para descobrir qual é o maior
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Verifica filho esquerdo
        if (esquerda < n && notas[esquerda] > notas[maior]) {
            maior = esquerda;
        }

        // Verifica filho direito
        if (direita < n && notas[direita] > notas[maior]) {
            maior = direita;
        }

        // Se encontrou um maior, faz troca
        if (maior != i) {

            int troca = notas[i];
            notas[i] = notas[maior];
            notas[maior] = troca;

            heapify(notas, n, maior);
        }
    }

    //parte que executa o programa
    public static void main(String[] args) {

        //notas dos alunos
        int[] notas = {75, 90, 68, 100, 82};

        //parte em que o programa organiza tudo
        heapSort(notas);

        System.out.println("Notas ordenadas:");

        for (int nota : notas) {
            System.out.print(nota + " ");
        }
    }

}
