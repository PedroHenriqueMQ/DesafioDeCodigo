import java.util.Scanner;

public class DesafioDaLetraA {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra para verificar se ela possui a letra \"A\":");
        String palavra = new Scanner(System.in).nextLine();

        int quantidadeRepetidas = 0;

        for(var letra: palavra.toCharArray()) {
            if(letra == 'a' || letra == 'A') quantidadeRepetidas++;
        }

        if (quantidadeRepetidas > 0) System.out.printf("Sua palavra pussui a letra \"A\" %d vez(es).", quantidadeRepetidas);
        else System.out.println("Sua palavra NÃO possui a letra \"A\".");
    }
}
