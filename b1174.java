import java.util.Scanner;

public class b1174 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        double[] vetor = criarVetor();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }

    }

    // Ler vetor
    public static double[] criarVetor() {
        int tamanho = 100;
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerDouble();
        }

        return vetor;
    }

    // Ler double
    public static double lerDouble() {

        double valor = LER.nextDouble();
        return valor;
    }

    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }
}