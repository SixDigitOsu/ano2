import java.util.Scanner;

public class b1547 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int ferlas = lerInt();
        for (int i = 0; i < ferlas; i++) {
            int tamanho = lerInt();
            int numeroCerto = lerInt();
            int[] chutesAlunos = criarVetor(tamanho);
            maisPerto(chutesAlunos, numeroCerto);
        }

    }

    // fodefo
    public static void maisPerto(int[] chutesAlunos, int numeroCerto) {
        int menorDiferenca = 9999;
        int posAcerto = 0;

        for (int i = 0; i < chutesAlunos.length; i++) {

            if (chutesAlunos[i] == numeroCerto) {
                posAcerto = i + 1;
                break;
            }
            if (chutesAlunos[i] > numeroCerto) {
                if ((chutesAlunos[i] - numeroCerto) < menorDiferenca) {
                    menorDiferenca = chutesAlunos[i] - numeroCerto;
                    posAcerto = i + 1;

                }
            } else {
                if ((numeroCerto - chutesAlunos[i]) < menorDiferenca) {
                    menorDiferenca = numeroCerto - chutesAlunos[i];
                    posAcerto = i + 1;
                }
            }

        }
        System.out.println(posAcerto);
    }

    // Ler vetor
    public static int[] criarVetor(int tamanho) {

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