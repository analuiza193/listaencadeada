package basica;

public class Processo {
    private int pid;
    public String conteudo;


    public Processo(int pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }
    public int getPid() {
        return pid;
    }
    public String getConteudo() {
        return conteudo;
    }
    @Override
    public String toString() {
        return "Processo [pid=" + pid + ", conteudo=" + conteudo + "]";
    }

}
