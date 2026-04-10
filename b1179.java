import java.util.Scanner;
public class b1179{
    final static Scanner LER = new Scanner(System.in);
public static void main(String[] args) {
    int[] vetor = criarVetor();
    int[] par = new int[5];
    int[] impar = new int [5];

}












// Ler vetor
    public static int[] criarVetor() {
        
        int[] vetor = new int[15];

        for (int i = 0; i < 15; i++) {
            vetor[i] = lerInt();
        }

        return vetor;
    }
// Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }
}