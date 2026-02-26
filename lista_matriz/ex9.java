package lista_matriz;

import java.util.Scanner;

public class ex9 {

final static Scanner LER = new Scanner(System.in);

public static void main(String[] args) {

int[][] A = new int[10][10];
int temp;


for (int i = 0; i < 10; i++)
for (int j = 0; j < 10; j++)
A[i][j] = lerInt();

// Linha 2 com linha 8
for (int j = 0; j < 10; j++) {
temp = A[1][j];
A[1][j] = A[7][j];
A[7][j] = temp;
}

// Coluna 4 com coluna 10
for (int i = 0; i < 10; i++) {
temp = A[i][3];
A[i][3] = A[i][9];
A[i][9] = temp;
}

// Diagonal principal com secundária
for (int i = 0; i < 10; i++) {
temp = A[i][i];
A[i][i] = A[i][9 - i];
A[i][9 - i] = temp;
}

// Linha 5 com coluna 10
for (int i = 0; i < 10; i++) {
temp = A[4][i];
A[4][i] = A[i][9];
A[i][9] = temp;
}

// Imprimir a matriz atualizada
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++)
System.out.print(A[i][j] + " ");
System.out.println();
}
}

// Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }

}