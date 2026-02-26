package lista_matriz;
import java.util.Scanner;
public class ex6 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        double[][] matriz = lerMatriz();
        double maior = acharMaiorDiagonalSecundaria(matriz);
        double[][] matrizDividida = dividirMatriz(matriz, maior);
        imprimirMatriz(matrizDividida);

    }





   // Imprimir matriz
   public static void imprimirMatriz (double[][] matriz){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
   }
   // Dividir elementos da matriz pelo maior valor
   public static double[][] dividirMatriz(double[][] matriz, double maior){
    double[][] matrizDividida = new double[8][8];
    for (int i = 0; i < matrizDividida.length; i++) {
        for (int j = 0; j < matrizDividida.length; j++) {
            matrizDividida[i][j] = (matriz[i][j] / maior);
        }
    }
    return matrizDividida;
   }
   // Achar o maior valor da diagonal secundária
   public static double acharMaiorDiagonalSecundaria(double[][] matriz){
    double maiorValor = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if((i + j) == 7){
            if( maiorValor < matriz[i][j]){
                maiorValor = matriz[i][j];
            }
            }
        }
    }
    return maiorValor;
   }
   // Ler matriz
   public static double[][] lerMatriz(){
    double[][] matriz = new double[8][8];
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
