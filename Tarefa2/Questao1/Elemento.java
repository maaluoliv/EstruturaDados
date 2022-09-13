package Tarefa2.Questao1;


public class Elemento {

    private Elemento proximo;
    private int usuario;

    public Elemento(int usuario) {
        this.usuario = usuario;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public int getUsuario() {
        return this.usuario;
    }

    public void setUsuario(int usuario) {
        usuario = usuario;
    }
}
