import com.sun.jdi.PathSearchingVirtualMachine;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;


public class Questao1 {
    public static void main(String[] args) throws FileNotFoundException {

        Queue<String> pq = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        Stack pilha = new Stack();

        scanner = new Scanner(new File("./atv/Atv3EstruturaDados.txt"));

             while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
             }

        System.out.println("***Método de Interar a Fila***");
        Iterator iterator = pq.iterator();

        System.out.println(pilha);

             while(!pilha.empty()){
            System.out.println(pilha.pop());
            }

        
















    }
}
