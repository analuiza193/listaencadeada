package seminario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetorColle {
    public static void main(String[] args) {
        List <String>lista= new ArrayList<String>();

        lista.add("ana");
        lista.add("teste");
        lista.add("joao");
        lista.add("clara");

        System.out.println(lista.size());

        System.out.println(lista.toString());
    
        Collections.sort(lista);// coloca em ordem alfabetica

        System.out.println(lista.toString());

        //adicionar o maria
        lista.add(1,"maria");
        System.out.println(lista.toString());

        // remover o maria
        lista.remove(1);
        System.out.println(lista.toString());

    }
}
