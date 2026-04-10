import java.util.Scanner;

public class b1566 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int enzo = lerInt();
        for (int i = 0; i < enzo; i++) {
            int[] alturas = criarVetor();
            ordenaVetor(alturas);

        }

    }
    // ordena
    public static void ordenaVetor(int alturas[]) {
        for (int i = 1; i < alturas.length; ++i) {
            int key = alturas[i];
            int j = i - 1;

            while (j >= 0 && alturas[j] > key) {
                alturas[j + 1] = alturas[j];
                j = j - 1;
            }
            alturas[j + 1] = key;
        }
        for (int i = 0; i < alturas.length; i++) {
            System.out.printf("%d ", alturas[i]);
        }
        System.out.println();
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
