import java.util.Arrays;
import java.util.Scanner;

public class b1548 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int tini = lerInt();
        for (int i = 0; i < tini; i++) {
            int[] vetor = criarVetor();
            int[] vetor2 = passaPraOtro(vetor);
            Arrays.sort(vetor);
            vetor = invertedor(vetor);
            ache7erros(vetor, vetor2);
        }

    }

    public static void ache7erros(int[] vetor, int[] vetor2) {
        int igualidades = vetor.length;
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor[i] != vetor2[i]) {
                igualidades--;
            }
        }
        System.out.println(igualidades);
    }

    // Inverter vetor
    public static int[] invertedor(int[] vetor) {

        int[] vetorInvertido = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {

            vetorInvertido[i] = vetor[vetor.length - i - 1];

        }

        return vetorInvertido;
    }

    public static int[] passaPraOtro(int[] vetor) {
        int[] vetor2 = new int[vetor.length];
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = vetor[i];
        }
        return vetor2;
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
