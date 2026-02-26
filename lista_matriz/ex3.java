package lista_matriz;
import java.util.Scanner;
public class ex3 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int soma = somarDiagonalSecundaria(matriz);
        System.out.println(soma);

    }
   // Somar diagonal secundária da matriz
   public static int somarDiagonalSecundaria(int matriz[][]){
    int soma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if((i + j) == 5){
            soma+= matriz[i][j];
            }
        }
    }
    return soma;
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
