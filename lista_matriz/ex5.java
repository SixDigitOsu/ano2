package lista_matriz;
import java.util.Scanner;
public class ex5 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int menor = acharMenorDiagonalSecundaria(matriz);
        System.out.println(menor);

    }
   // Achar menor valor da diagonal principal
   public static int acharMenorDiagonalSecundaria(int matriz[][]){
    int menorValor = 999;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if((i + j) == 5){
            if( menorValor > matriz[i][j]){
                menorValor = matriz[i][j];
            }
            }
        }
    }
    return menorValor;
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
