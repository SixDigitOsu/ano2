package lista_matriz;
import java.util.Scanner;
public class ex9 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int[] vetorLinha = linhaEmVetor(matriz);
        int[] vetorColuna = colunaEmVetor(matriz);
        int[] vetorDiagonal = diagonalEmVetor(matriz);
        int[] vetorColuna10 = coluna10EmVetor(matriz);
        matriz = alteraMatriz(vetorLinha, vetorColuna, vetorDiagonal, vetorColuna10, matriz);
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
// Alterar matriz
public static int[][] alteraMatriz(int[] vetorLinha, int[] vetorColuna, int[] vetorDiagonal, int[] vetorColuna10, int[][] matriz){
    
    int xvl = 0;
    int xvc = 0;
    int xvd = 0;
    int xc10 = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if(i + j == 9){
                matriz[i][j] = vetorDiagonal[xvd];
                xvd++;
            }
            if(i == 7){
                matriz[i][j] = vetorLinha[xvl];
                xvl++;
            }
            if(j == 9){
                matriz[i][j] = vetorColuna[xvc];
                xvc++;
            }
            if (i == 4) {
                matriz[i][j] = vetorColuna10[xc10];
                xc10++;

            }
            
        }
    }

    return matriz;
}
// Transferir coluna10 para vetor
public static int[] coluna10EmVetor(int[][] matriz){
    int[] vetor = new int[10];
    
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(j == 9){
                    vetor[x] = matriz[i][j];
                    x++;
                }
            }
        }
    
    
    return vetor;
   }
// Transferir diagonal para vetor
   public static int[] diagonalEmVetor(int[][] matriz){
    int[] vetor = new int[10];
    
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(i == j){
                    vetor[x] = matriz[i][j];
                    x++;
                }
            }
        }
    
    
    return vetor;
   }

   // Transferir coluna4 para vetor
   public static int[] colunaEmVetor(int[][] matriz){
    int[] vetor = new int[10];
    
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(j == 3){
                    vetor[x] = matriz[i][j];
                    x++;
                }
            }
        }
    
    
    return vetor;
   }
   // Transferir linha2 para vetor
   public static int[] linhaEmVetor(int[][] matriz){
    int[] vetor = new int[10];
    
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(i == 2){
                    vetor[x] = matriz[i][j];
                    x++;
                }
            }
        }
    
    
    return vetor;
   }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[5][5];
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
