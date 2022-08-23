package Tarefa1;

import java.util.Random;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        int num_vetor, posicao = 0;
        int vetor[];
        vetor = new int[10];

        Scanner scan = new Scanner(System.in);

        Random numrandomico = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numrandomico.nextInt(999);
        }
        System.out.println("Vetor randômico:");
        for (int num : vetor)
            System.out.println(num);

        System.out.println(" Digite um número para pesquisa: ");
        num_vetor = scan.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (num_vetor == vetor[i])
                System.out.println("Número existente na posição" + i);

        }
    }

}