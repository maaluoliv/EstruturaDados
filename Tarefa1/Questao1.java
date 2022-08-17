package Tarefa1;

import java.util.Random;

public class Questao1 {
    public static void main(String[] args) {
        int vetor[]; //declaração do vetor
        vetor = new int[10];//alocação de memória

        Random numrandomico = new Random();

        for(int i=0; i<vetor.length; i++){
       // for (int i = 0; i < 10; i++) {
            vetor[i] = numrandomico.nextInt(999);
            if(vetor[i] ==30){
        }

        //for( i=0; i<p.length; i++){
        //     if(p[i] ==30){
        //        System.out.println("30 se encontra na posição " + i);

//for( int i =0;  i < 15; i++){
//        System.out.println ("Digite um valor para a posição " + i + " do vetor");
//        p[i] = ler.nextInt();
//    }


        System.out.println("Vetor randômico:");
        //exibe todo o vetor
        for(int num:vetor)
            System.out.println(num);

    }
}

