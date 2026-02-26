package lista_matriz;
import java.util.Scanner;
public class ex10 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int soma = somarParesMatriz(matriz);
        System.out.println(soma);

    }
   // Somar par da matriz
   public static int somarParesMatriz(int matriz[][]){
    int soma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if(i % 2 == 0){
            soma+= matriz[i][j];
            }
        }
    }
    return soma;
   }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[9][9];
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
