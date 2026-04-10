import java.util.Scanner;

public class b1180 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vetor = criarVetor();
        menorEpos(vetor);

    }

    // Achar menor valor e sua posição
    public static void menorEpos(int[] vetor) {
        int posMenor = 0;
        int valorMenor = 99999;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= valorMenor) {
                valorMenor = vetor[i];
                posMenor = i;
            }
        }

        System.out.printf("Menor valor: %d\nPosicao: %d\n", valorMenor, posMenor);
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
