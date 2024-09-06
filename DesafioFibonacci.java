import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args) {
        List<Integer> sequenciaFibonacci = new ArrayList<>(Arrays.asList(0, 1));

        System.out.println("Digite um número para verificar se ele pertence a sequencia de Fibonacci:");
        int numeroActual = new Scanner(System.in).nextInt();

        while (sequenciaFibonacci.getLast() < numeroActual) {
            sequenciaFibonacci.add(
                    sequenciaFibonacci.getLast() +
                            sequenciaFibonacci.get(sequenciaFibonacci.size()-2)
            );
        }

        if(sequenciaFibonacci.contains(numeroActual)) System.out.println("Seu número está presente na sequência de Fibonacci.");
        else System.out.println("Seu número NÃO está presente na sequência de Fibonacci.");

        System.out.println(sequenciaFibonacci);
    }
}