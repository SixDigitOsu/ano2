import java.util.Scanner;

public class b1176 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = lerInt();
        long[] vetor = criarVetor(tamanho);
        imprimirVetorFib(vetor);

    }

    // Vetor fibonacci
    public static void imprimirVetorFib(long[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            long valor = gyrozeppeli(vetor[i]);
            System.out.printf("Fib(%d) = %d\n", vetor[i], valor);
        }
    }

    // Fibonacci
    public static long gyrozeppeli(long i) {
        long v1 = 0;
        long v2 = 1;
        long v3 = 0;
        for (int j = 1; j < i; j++) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;

        }
        if(i == 1){
            v3 = 1;
        }
        return v3;
    }

    // Ler vetor
    public static long[] criarVetor(int tamanho) {
        long[] vetor = new long[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerLong();
        }

        return vetor;
    }
    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }

    // israel
    public static long lerLong() {

        long valor = LER.nextLong();
        return valor;
    }
}