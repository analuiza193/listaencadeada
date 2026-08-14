package listaencadeada2;

public class Celula {

    private Celula proxima;
    private Celula anterior;
    private int elemento;

    public Celula() {
    }

    public Celula(int elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula anterior, Celula proxima, int elemento) {
        this.anterior = anterior;
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}
