

package lista_matriz;
import java.util.Scanner;
public class ex12 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int soma = somarAbaixoDiagonalPrincipal(matriz);
        double media = soma / (((matriz.length * matriz.length) / 2) - (matriz.length / 2));
        System.out.println(media);

    }
   // Somar abaixo dadiagonal principal 
   public static int somarAbaixoDiagonalPrincipal(int matriz[][]){
    int soma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (i > j) {
            soma+= matriz[i][j];
            }
        }
    }
    return soma;
   }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[4][4];
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

