
import java.util.Scanner;

public class copypaste {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

    }
    // Prenche vetor aleatório
    public static int[] vetorAleatorio(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        return vetor;

    }

    // Imprimir matriz
   public static void imprimirMatriz (double[][] matriz){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
   }
    // Imprimir vetor
    public static void imprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf(" %d ", v[i]);

        }
        System.out.println();
    }

    // Ler vetor
    public static int[] criarVetor(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerInt();
        }

        return vetor;
    }

    // Inverter vetor
    public static int[] invertedor(int[] vetor) {

        int[] vetorInvertido = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {

            vetorInvertido[i] = vetor[vetor.length - i - 1];

        }

        return vetorInvertido;
    }

    // Inveter vetor (otrogeito)
    public static int[] inverterVetor(int[] v) {
        int[] vetor = new int[v.length];

        for (int i = v.length; i >= 0; i--) {
            int j = 0;
            vetor[j] = v[i];
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
