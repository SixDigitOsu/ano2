
import java.util.Scanner;

public class copypaste {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

    }

   // Ler matriz
   public static int[][] lerMatriz(){
    int  tamanho = lerInt();
    int [][] matriz = new int[tamanho][tamanho];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = lerInt();
        }
    }
    return matriz;
   }

    // BUBBLE SORT
    public static void ordenaVetor(int[] alturas) {

        for (int i = 0; i < alturas.length - 1; i++) {
            for (int j = 0; j < alturas.length - 1 - i; j++) {

                if (alturas[j] > alturas[j + 1]) {
                    int temp = alturas[j];
                    alturas[j] = alturas[j + 1];
                    alturas[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < alturas.length; i++) {
            System.out.printf("%d ", alturas[i]);
        }
        System.out.println();

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
    public static int[] criarVetor() {
        int tamanho = lerInt();
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
