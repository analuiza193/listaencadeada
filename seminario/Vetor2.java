package seminario;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        
        String nome[]= new String[3];

        System.out.println("Digite 3 nomes:");

        for(int cont = 0; cont<nome.length; cont++){
            nome[cont]= in.next();
        }
        Arrays.sort(nome);// coloca em ordem alfabetica
        System.out.println(Arrays.toString(nome));
    } 
}
