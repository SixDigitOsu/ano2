import java.util.Scanner;

public class b1168 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int testes = LER.nextInt();
        for (int i = 0; i < testes; i++) {
            String seqNumero = LER.next();
            char[] stringNumero = seqNumero.toString().toCharArray();
            contaLeds(stringNumero);
        }

    }

    public static void contaLeds(char[] stringNumero) {
        int qtdLeds = 0;
        for (int i = 0; i < stringNumero.length; i++) {

            switch (stringNumero[i]) {

                case '1':
                    qtdLeds = qtdLeds + 2;
                    break;
                case '2':
                    qtdLeds = qtdLeds + 5;
                    break;
                case '3':
                    qtdLeds = qtdLeds + 5;
                    break;
                case '4':
                    qtdLeds = qtdLeds + 4;
                    break;
                case '5':
                    qtdLeds = qtdLeds + 5;
                    break;
                case '6':
                    qtdLeds = qtdLeds + 6;
                    break;
                case '7':
                    qtdLeds = qtdLeds + 3;
                    break;
                case '8':
                    qtdLeds = qtdLeds + 7;
                    break;
                case '9':
                    qtdLeds = qtdLeds + 6;
                    break;
                case '0':
                    qtdLeds = qtdLeds + 6;
                    break;

            }
       
        }
        System.out.printf("%d leds\n", qtdLeds);

    }
}