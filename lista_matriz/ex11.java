

package lista_matriz;
import java.util.Scanner;
public class ex11 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int [] vetor = selecionarDiagonalPrincipal(matriz);
        matriz = multiplicarMatriz(matriz, vetor);
        imprimirMatriz(matriz);
        

    }

   // Imprimir matriz
   public static void imprimirMatriz (int[][] matriz){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
   }
   // Multiplicar pela diagonal
   public static int[][] multiplicarMatriz(int[][] matriz, int[] vetor){

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = (matriz[i][j] * vetor[i]);
        }
    }
    return matriz;
   }
   
   // Somar diagonal principal 
   public static int[] selecionarDiagonalPrincipal(int matriz[][]){
    int [] vetor = new int[6];
    int iVetor = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (i == j) {
            vetor[iVetor] = matriz[i][j];
            iVetor++;
            }
        }
    }
    return vetor;
   }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[6][6];
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

