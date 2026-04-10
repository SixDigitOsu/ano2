import java.util.Scanner;

public class b2381 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int tamanho = lerInt();
        int sorteado = lerInt();
        String[] nomes = criarVetor(tamanho);
        int[] posicoes = acharPosicoes(letras, nomes);
        ordena(nomes, posicoes, sorteado);
        acharSorteado(sorteado, nomes, posicoes);

    }

    public static void acharSorteado(int sorteado, String[] nomes, int[] posicoes) {
        for (int i = 0; i < posicoes.length; i++) {
            if (i == (sorteado - 1)) {
                System.out.println(nomes[i]);
            }
        }
    }

    public static void ordena(String[] nomes, int[] posicoes, int sorteado) {

        for (int i = 1; i < posicoes.length; ++i) {
            int key = posicoes[i];
            String key2 = nomes[i];
            int j = i - 1;

            while (j >= 0 && posicoes[j] > key) {
                posicoes[j + 1] = posicoes[j];
                nomes[j + 1] = nomes[j];
                j = j - 1;
            }
            posicoes[j + 1] = key;
            nomes[j + 1] = key2;
        }

    }

    public static int[] acharPosicoes(char[] letras, String[] nomes) {
        int[] posicoes = new int[nomes.length];

        for (int i = 0; i < posicoes.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (nomes[i].charAt(0) == letras[j]) {
                    posicoes[i] = j;
                }
            }
        }
        return posicoes;
    }

    // Ler vetor
    public static String[] criarVetor(int tamanho) {

        String[] vetor = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = LER.next();
        }

        return vetor;
    }

    // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }
}
