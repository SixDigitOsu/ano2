import java.util.Scanner;

public class b1174 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        double[] vetor = criarVetor(100);
        int[] pos = contam10(vetor);
        double[] vetorM10 = prencheVetor(vetor, pos);
        imprimir(vetorM10, pos);

    }

    // Imprime
    public static void imprimir(double[] vm10, int[] pos) {
        int j = 1;
        for (int i = 0; i < vm10.length; i++) {
            System.out.printf("A[%d] = %.1f\n", pos[j], vm10[i]);
            j++;
        }
    }

    // Prenche um vetor com todos os valores menores que 10
    public static double[] prencheVetor(double[] vetor, int[] pos) {
        double[] vetorM10 = new double[pos[0]];

        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                vetorM10[j] = vetor[i];
                j++;
            }
        }
        return vetorM10;
    }

    // Conta a quantidade de valores menores que 10
    public static int[] contam10(double[] vetor) {
        int[] pos = new int[100];
        int tamanho = 0;
        int j = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                tamanho++;
                pos[j] = i;
            }
        }
        pos[0] = tamanho;
        return pos;
    }

    // Ler vetor
    public static double[] criarVetor(int tamanho) {
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

}