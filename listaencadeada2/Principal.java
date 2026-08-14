package listaencadeada2;

public class Principal {
    public static void main(String[] args) {

        ListaDuplamente lista = new ListaDuplamente();

        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);

        System.out.println(lista.toString());

        lista.inserirNoComeco(7);
        System.out.println(lista.toString());

        lista.inserirPorPosicao(8, 3);
        System.out.println(lista.toString());

        lista.removerDoInicio(0);
        System.out.println(lista.toString());

        lista.removerDoFim(4);
        System.out.println(lista.toString());

        lista.removerPorPosicao(2);
        System.out.println(lista.toString());
    }

}
