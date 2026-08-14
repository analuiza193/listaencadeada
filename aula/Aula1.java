package aula;

import java.util.Scanner;

public class Aula1 {

    private int matriz[][] = new int[2][3];
     public void criarMatriz(){

        Scanner cs= new Scanner(System.in);

        for(int i= 0; i<matriz.length;i ++){
            
        }

     }

    public static void main(String[] args) {
        int [][] matriz = new int[3][2];
        String linha1;
        String linha2;
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Digite o numero " + (j+1)+" da coluna "+ (i + 1)+": ");
                matriz[i][j]= sc.nextInt();
                
            }
        }
        System.out.println("");

        for(int[] arrBase: matriz){
            for(int num: arrBase){
                System.out.println(num);

            }
        }
        
    }
}

