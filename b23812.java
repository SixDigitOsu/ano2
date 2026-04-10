import java.util.Arrays;
import java.util.Scanner;

public class b23812 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanho = lerInt();
        int sorteado = lerInt();
        String[] nomes = criarVetor(tamanho);
        Arrays.sort(nomes);
        for (int i = 0; i < nomes.length; i++) {
            if (i == sorteado - 1) {
                System.out.println(nomes[i]);
            }
        }
    }

    // Ler vetor
    public static String[] criarVetor(int tamanho) {

        String[] vetor = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = LER.next();
        }

        return vetor;
    }

    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }
}
