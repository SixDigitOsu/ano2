package lista_matriz;

public class ex01 {
    public static void main(String[] args) {
        montarMatriz();
    }

    public static void montarMatriz(){
        int[][] matriz = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < 10; j++) {
                matriz[i-1][j-1] = ((2*i) + (j*j));
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
