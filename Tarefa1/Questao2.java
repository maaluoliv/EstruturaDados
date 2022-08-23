package Tarefa1;
import java.util.Random;
public class Questao2 {


        public static void main(String[] args) {
            int vetor[];
            vetor = new int[4];
            Random numrandomico = new Random();
            int maxValue= Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;

            for(int i=0;i<4;i++){
                vetor[i]= numrandomico.nextInt(999);
            }

            for(int i=0;i<4;i++){
                if (vetor[i]>maxValue)
                    maxValue=vetor[i];
                if (vetor[i]<minValue)
                    minValue=vetor[i];
            }


            System.out.println("O maior valor é " + maxValue);
            System.out.println("O menor valor é " + minValue);

            System.out.println("Vetor randômico:");

            for(int num:vetor)
                System.out.println(num);

        }

    }

