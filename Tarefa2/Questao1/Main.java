package Tarefa2.Questao1;


public class Main {
    public static void main(String[] args) {

        Lista filaPrioridade = new Lista();
        Lista filaNormal = new Lista();

        for (int i = 1; i < 200; i++) {
            filaNormal.adicionar(i);

        }

        System.out.println("Todds da fila");
        for(int i=0; i<filaNormal.getTamanho(); i++)
        System.out.println(filaNormal.get(i).getUsuario());











    }
}