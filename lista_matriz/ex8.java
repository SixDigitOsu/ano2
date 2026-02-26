package lista_matriz;
import java.util.Scanner;
public class ex8 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int multiplicador = lerInt();
        int[] vetor = multiplistica(matriz, multiplicador);
        imprimirVetor(vetor);
        

    }

   // Imprimir vetor
   public static void imprimirVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
    System.out.println();
   }

   // Multiplicar e colocar no vetor
    public static int[] multiplistica(int[][] matriz, int multiplicador){
        int[] vetor = new int [36];
        int iVetor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                vetor[iVetor] = (matriz[i][j] * multiplicador);
                iVetor++;
            }
        }
        return vetor;
    }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[6][7];
    for ( int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = lerInt();
        }
    }
    return matriz;
   }
   // Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }

}
