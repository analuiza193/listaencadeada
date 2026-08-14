package listaencadeada2;

public class ListaDuplamente {

    private Celula cabeca;
    private Celula cauda;
    private int tamanho = 0;

    public ListaDuplamente() {
    }

    public ListaDuplamente(Celula cabeca, Celula cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Celula getCabeca() {
        return cabeca;
    }

    public void setCabeca(Celula cabeca) {
        this.cabeca = cabeca;
    }

    public Celula getCauda() {
        return cauda;
    }

    public void setCauda(Celula cauda) {
        this.cauda = cauda;
    }

    // Inserir no final
    public void inserir(int valor) {

        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            novaCelula.setAnterior(cauda);
            cauda.setProxima(novaCelula);
            cauda = novaCelula;
        }

        tamanho++;
    }

    // Inserir no começo
    public void inserirNoComeco(int valor) {

        Celula novaCelula = new Celula(valor);

        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            novaCelula.setProxima(cabeca);
            cabeca.setAnterior(novaCelula);
            cabeca = novaCelula;
        }

        tamanho++;
    }

    // Inserir em uma posição específica
    public void inserirPorPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            inserirNoComeco(valor);
            return;
        }

        if (posicao == tamanho) {
            inserir(valor);
            return;
        }

        Celula atual = cabeca;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        Celula novaCelula = new Celula(valor);

        Celula anterior = atual.getAnterior();

        novaCelula.setAnterior(anterior);
        novaCelula.setProxima(atual);

        anterior.setProxima(novaCelula);
        atual.setAnterior(novaCelula);

        tamanho++;
    }

    // Remover do início
    public void removerDoInicio(int posicao) {

        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        cabeca = cabeca.getProxima();

        if (cabeca == null) {
            cauda = null;
        } else {
            cabeca.setAnterior(null);
        }

        tamanho--;
    }

    // Remover do final
    public void removerDoFim(int posicao) {

        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        cauda = cauda.getAnterior();

        if (cauda == null) {
            cabeca = null;
        } else {
            cauda.setProxima(null);
        }

        tamanho--;
    }

    // Remover de uma posição específica
    public void removerPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            removerDoInicio(posicao);
            return;
        }

        if (posicao == tamanho - 1) {
            removerDoFim(posicao);
            return;
        }

        Celula atual = cabeca;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        Celula anterior = atual.getAnterior();
        Celula proxima = atual.getProxima();

        anterior.setProxima(proxima);
        proxima.setAnterior(anterior);

        atual.setAnterior(null);
        atual.setProxima(null);

        tamanho--;
    }

    @Override
    public String toString() {

        if (tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        Celula aux = cabeca;

        while (aux != null) {

            sb.append(aux.getElemento());

            if (aux.getProxima() != null) {
                sb.append(",");
            }

            aux = aux.getProxima();
        }

        sb.append("]");

        return sb.toString();
    }
}
