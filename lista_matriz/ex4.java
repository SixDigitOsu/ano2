package lista_matriz;
import java.util.Scanner;
public class ex4 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] matriz = lerMatriz();
        int soma = somarColunaELinha(matriz);
        System.out.println(soma);

    }

   // Somar coluna e linha
   public static int somarColunaELinha(int matriz[][]){
    int soma = 0;
    for (int i = 0; i < 7 ; i++) {
        for (int j = 0; j < 6; j++) {
           
            if(i == 4 || j == 2){
                soma += matriz[i][j];
            }
            
        }
    }
    
    return soma;
   }
   // Ler matriz
   public static int[][] lerMatriz(){
    int[][] matriz = new int[7][6];
    for ( int i = 0; i < 7; i++) {
        for (int j = 0; j < 6; j++) {
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
