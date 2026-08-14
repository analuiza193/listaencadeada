package seminario;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Aluno>lista= new ArrayList<Aluno>();

        Aluno a= new Aluno("JOAO", "123");
        Aluno a1= new Aluno("MATHEUS", "456");
        Aluno a2= new Aluno("BELTRANO", "789");
        Aluno a3= new Aluno("ciclano", "789");

        lista.add(a);
        lista.add(a1);
        lista.add(a2);

        for(int cont = 0; cont<lista.size(); cont++){
            System.out.print(lista.get(cont).getNome()+" ");
        }

        lista.add(1,a3);
        System.out.println(" ");

        for(int cont = 0; cont<lista.size(); cont++){
            System.out.println(lista.get(cont).getNome()+" ");
        }

        System.out.println(" ");

        lista.remove(1); 


        for(int cont = 0; cont<lista.size(); cont++){
            System.out.println(lista.get(cont).getNome()+" ");
        }
    }
}
