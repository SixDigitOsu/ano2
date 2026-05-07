import java.util.Scanner;

public class b1253 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int testes = LER.nextInt();
        for (int i = 0; i < testes; i++) {
            String sequencia = LER.next();
            char[] vetorChar = sequencia.toCharArray();
            int cesar = LER.nextInt();
            int[] vetorNumero = sequenciaEmNumeros(vetorChar, cesar);
            cifraDeCesar(vetorNumero);
        }
    }

    public static void cifraDeCesar(int [] vetorNumero){
        char [] vetorChar = new char[vetorNumero.length];

        for (int i = 0; i < vetorChar.length; i++) {
            vetorChar[i] = converteNumeroLetra(vetorNumero[i]);
        }

        String cesar = vetorChar.toString();
        System.out.println(cesar);
    }

    public static int[] sequenciaEmNumeros(char[] vetorChar, int cesar){

    int [] vetorNumero = new int[vetorChar.length];
    for (int i = 0; i < vetorNumero.length; i++) {
        vetorNumero[i] = converteLetraNumero(vetorChar[i]) - cesar;
        
    }
    return vetorNumero;
    }
    public static char converteNumeroLetra(int numero) {
        char letra = ' ';
        switch (numero) {
            case 1:
                letra = 'A';
                break;
            case 2:
                letra = 'B';
                break;
            case 3:
                letra = 'C';
                break;
            case 4:
                letra = 'D';
                break;
            case 5:
                letra = 'E';
                break;
            case 6:
                letra = 'F';
                break;
            case 7:
                letra = 'G';
                break;
            case 8:
                letra = 'H';
                break;
            case 9:
                letra = 'I';
                break;
            case 10:
                letra = 'J';
                break;
            case 11:
                letra = 'K';
                break;
            case 12:
                letra = 'L';
                break;
            case 13:
                letra = 'M';
                break;
            case 14:
                letra = 'N';
                break;
            case 15:
                letra = 'O';
                break;
            case 16:
                letra = 'P';
                break;
            case 17:
                letra = 'Q';
                break;
            case 18:
                letra = 'R';
                break;
            case 19:
                letra = 'S';
                break;
            case 20:
                letra = 'T';
                break;
            case 21:
                letra = 'U';
                break;
            case 22:
                letra = 'V';
                break;
            case 23:
                letra = 'W';
                break;
            case 24:
                letra = 'X';
                break;
            case 25:
                letra = 'Y';
                break;
            case 26:
                letra = 'Z';
                break;
        }
        return letra;
    }

    public static int converteLetraNumero(char letra) {
        int numero = 0;
        switch (letra) {
            case 'A':
                numero = 1;
                break;
            case 'B':
                numero = 2;
                break;
            case 'C':
                numero = 3;
                break;
            case 'D':
                numero = 4;
                break;
            case 'E':
                numero = 5;
                break;
            case 'F':
                numero = 6;
                break;
            case 'G':
                numero = 7;
                break;
            case 'H':
                numero = 8;
                break;
            case 'I':
                numero = 9;
                break;
            case 'J':
                numero = 10;
                break;
            case 'K':
                numero = 11;
                break;
            case 'L':
                numero = 12;
                break;
            case 'M':
                numero = 13;
                break;
            case 'N':
                numero = 14;
                break;
            case 'O':
                numero = 15;
                break;
            case 'P':
                numero = 16;
                break;
            case 'Q':
                numero = 17;
                break;
            case 'R':
                numero = 18;
                break;
            case 'S':
                numero = 19;
                break;
            case 'T':
                numero = 20;
                break;
            case 'U':
                numero = 21;
                break;
            case 'V':
                numero = 22;
                break;
            case 'W':
                numero = 23;
                break;
            case 'X':
                numero = 24;
                break;
            case 'Y':
                numero = 25;
                break;
            case 'Z':
                numero = 26;
                break;

        }
        return numero;
    }
}