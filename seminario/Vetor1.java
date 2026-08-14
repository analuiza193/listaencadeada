package seminario;

import java.util.Arrays;

public class Vetor1 {
    public static void main(String[] args) {
        int vetores[]= new int[8];
        int valor =8;

        for(int cont = 0; cont<vetores.length; cont++){
            valor--;
            vetores[cont]= cont;// se colocar valor, vai de forma decrescentee
        }
        System.out.println(Arrays.toString(vetores));
    }
}
