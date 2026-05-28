import java.util.Scanner;

public class b1871 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = LER.nextInt();
            int m = LER.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int soma = n + m;
            char[] c = String.valueOf(soma).toCharArray();
            int valor = contaZeroCortaFazTudo(c);
            System.out.println(valor);
        }
    }

    public static int contaZeroCortaFazTudo(char[] c) {
        // conta zero-------------------------
        int qtd0 = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                qtd0++;
            }
        }
        // tira zero------------------------------------
        char[] sacrificio = new char[c.length - qtd0];
        int a = 0;
        for (int j = 0; j < c.length; j++) {
            if (c[j] != '0') {
                sacrificio[a] = c[j];
                a++;
            }
        }
        // bota em número--------------------------------
        int[] numero = new int[sacrificio.length];
        for (int j = 0; j < numero.length; j++) {
            numero[j] = sacrificio[j - 0];
        }
        // fala o valor-----------------------------------------------------------
        int valorNumero = 0;
        for (int j = 0; j < numero.length; j++) {
            valorNumero += numero[j] * Math.pow(10, numero.length - j - 1);
        }

        return valorNumero;
    }
}
