import java.util.Scanner;

public class b1162 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int pintolfi = lerInt();
        for (int i = 0; i < pintolfi; i++) {
            int[] vetor = criarVetor();
            ordenaVetor(vetor);

        }
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

    // Ordena e conta
    public static void ordenaVetor(int[] vetor) {
        int quantos = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    quantos++;
                }
            }
        }
        System.out.printf("Optimal train swapping takes %d swaps.\n", quantos);
    }

    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }
}
