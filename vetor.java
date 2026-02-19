import java.util.Scanner;
public class vetor{
    final static Scanner LER = new Scanner(System.in);
public static void main(String[] args) {
    while(true){
    int[] vetor = criarVetor();
    vetor = lerVetor(vetor);
    int escolha = lerInt();
    if(escolha == 1){
        imprimirVetor(vetor);
    }else{
         embaralharVetor(vetor);
       
    }
    }

}

// Embaralhar o vetor
public static void embaralharVetor(int[]vetor){
    int[] posicoesOcupadas = new int[vetor.length];
    int[] vetorEmbaralhado = new int[vetor.length];
    
    boolean verificancia;
    // Verifica se não tem posições repitidas
    
        for (int i = 0; i < vetor.length; i++) {
             int posicao = 0;
            do {
                
                
                verificancia = true;
                for (int j = 0; j < posicoesOcupadas.length; j++) {
                    posicao = ((int)(Math.random() * vetor.length));
                    if(posicao == posicoesOcupadas[j]){
                        verificancia = false;
                    }
                    posicoesOcupadas[j] = posicao;

                }
            } while (verificancia == false);
        

        for (int a = 0; a < vetorEmbaralhado.length; a++) {
            vetorEmbaralhado[a] = vetor[posicoesOcupadas[a]];
        }               
        }
    imprimirVetor(vetorEmbaralhado);
}
// Imprimir vetor
    public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

// Ler valores do vetor
    public static int [] lerVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInt();         
        }
        return vetor;
    }
// Criar vetor
    public static int[] criarVetor(){
        int size = lerInt();
        int[] vetor = new int [size];
        return vetor;
    }
// Ler inteiro
    public static int lerInt() {

        int valor = LER.nextInt();
        return valor;
    }

}