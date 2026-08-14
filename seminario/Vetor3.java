package seminario;

import java.util.Scanner;

public class Vetor3 {
    static class Somar{

        public static int soma(int[]a){
            int soma= 0;
            for(int cont = 0; cont< a.length; cont ++){
                soma+= a[cont];

            }
            return soma;
        }
    }
    public static void main(String[] args) {
        int []ar= new int[4];

        Scanner in= new Scanner(System.in);

        int i = 0;

        for(i= 0; i< ar.length; i++){
            ar[i]= in.nextInt();
        }
        System.out.println("A soma do array é:"+ Somar.soma(ar));
    } 
}
