import java.util.Scanner;
public class b1175 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int [] vetor = criarVetor(20);
        troca(vetor);
        imprimirVetor(vetor);









    }
    // Imprimir vetor
    public static void imprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf(" %d ", v[i]);

        }
        System.out.println();
    }
    // Troca as posições de lugar
    public static void troca(int [] vetor){
        int j = vetor.length - 1;
        for (int i = 0; i < vetor.length / 10; i++) {
            int varTroca = vetor[j];        
            vetor[i] = varTroca;
            vetor[j] = vetor[i];
            j--;
            
        }
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
