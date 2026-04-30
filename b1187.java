import java.util.Scanner;

public class b1187 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String operacao = ler();
        double[][] matriz = lerMatriz();
        somaMediaSuperior(matriz, operacao);
    }

    public static void somaMediaSuperior(double[][] matriz, String operacao) {
        double soma = 0;
        int zgeg = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j && j + i < 11) {
                    soma += matriz[i][j];
                    zgeg++;
                }
            }
        }
        if (operacao.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            double media = (soma / zgeg);
            System.out.printf("%.1f\n", media);
        }

    }

    public static double[][] lerMatriz() {
        double[][] matriz = new double[12][12];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = lerDouble();
            }
        }
        return matriz;
    }

    public static String ler() {
        String letra = LER.next();
        return letra;
    }

    // Ler double
    public static double lerDouble() {

        double valor = LER.nextDouble();
        return valor;
    }
}