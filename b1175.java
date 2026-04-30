import java.util.Scanner;

public class b1175 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = criarVetor();
        trocarVetor(vetor);

    }

    // Troca posições
    public static void trocarVetor(int[] vetor) {
        int[] vetorTrocado = new int[vetor.length];
        int j = vetor.length;
        for (int i = 0; i < 10; i++) {
            vetorTrocado[i] = vetor[j - 1];
            vetorTrocado[j - 1] = vetor[i];
            j--;
        }

        for (int i = 0; i < vetorTrocado.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetorTrocado[i]);
        }
    }

    // Ler vetor
    public static int[] criarVetor() {

        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
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