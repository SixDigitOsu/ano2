import java.util.Scanner;

public class b1120 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            char num = LER.next().charAt(0);
            if (num == '0') {
                break;
            }
            String numeros = LER.next();
            char[] sequencia = numeros.toCharArray();
            imprimiCerto(sequencia, num);
        }

    }

    public static void imprimiCerto(char[] sequencia, char num) {
        int qtdPrimi = 0;
        
        for (int i = 0; i < sequencia.length; i++) {
            if (sequencia[i] != num && sequencia[i] != '0') {
                System.out.print(sequencia[i]);
                qtdPrimi++;
            }

        }
        System.out.println();
        if (qtdPrimi == 0) {
            System.out.println("0");
        }
    }
}
