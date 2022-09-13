package Tarefa2.Questao1;



public class Lista {
    private int tamanho;
    private Elemento primeiro;
    private Elemento ultimo;

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        tamanho = tamanho;
    }


    public void adicionar(int novoUsuario) {
        Elemento novoElemento = new Elemento(novoUsuario);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(int valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getUsuario() == valorProcurado) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
        public Elemento get ( int posicao){
           Elemento atual = this.primeiro;
            for (int i = 0; i < posicao; i++) {
                if (atual.getProximo() != null) {
                    atual = atual.getProximo();
                }
            }
            return atual;

        }

    }