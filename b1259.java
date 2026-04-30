import java.util.Arrays;
import java.util.Scanner;

public class b1259 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = criarVetor();
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        vetor = invertedor(vetor);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

    }

    // Inverter vetor
    public static int[] invertedor(int[] vetor) {

        int[] vetorInvertido = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {

            vetorInvertido[i] = vetor[vetor.length - i - 1];

        }

        return vetorInvertido;
    }

    // Ler vetor
    public static int[] criarVetor() {
        int tamanho = lerInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerInt();
        }

        return vetor;
    }

    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }

}