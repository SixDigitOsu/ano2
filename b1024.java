import java.util.Scanner;

public class b1024 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        if(LER.hasNextInt()){
        int testes = LER.nextInt();
        LER.nextLine();
        StringBuilder resultadoFinal = new StringBuilder();
        for (int i = 0; i < testes; i++) {

            String texto = LER.nextLine();
            char[] chararray = texto.toCharArray();
            chararray = primeiraPassada(chararray);
            chararray = segundaPassada(chararray);
            terceiraPassada(chararray); 
            resultadoFinal.append(chararray).append("\n");
            

        }
        System.out.print(resultadoFinal);
    }

    }

    public static void sout(char[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public static char[] terceiraPassada(char[] c) {
        for (int i = c.length / 2; i < c.length; i++) {

            c[i]--;

        }
        return c;
    }

    public static char[] segundaPassada(char[] v) {
        char[] vetor = new char[v.length];
        int j = 0;
        for (int i = v.length - 1; i >= 0; i--) {

            vetor[j] = v[i];
            j++;
        }

        return vetor;
    }

    public static char[] primeiraPassada(char[] chararray) {
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] >= 'a' && chararray[i] <= 'z' || chararray[i] >= 'A' && chararray[i] <= 'Z') {

                chararray[i] += 3;

            }
        }
        return chararray;
    }
}
