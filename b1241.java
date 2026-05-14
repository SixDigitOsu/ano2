import java.util.Scanner;

public class b1241 {
     final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int testes = LER.nextInt();
        for (int i = 0; i < testes; i++) {
           String a = LER.next();
           String b = LER.next();
           char[] receba = a.toCharArray();
           char[] metemete = b.toCharArray();
           imprimi(receba, metemete);
        }
    }  
    public static void imprimi(char[] receba, char[] metemete){
        boolean condicao = cabeOuNao(receba, metemete);
        if (condicao) {
            System.out.println("encaixa");
        }else{
            System.out.println("nao encaixa");
        }
    }

    public static boolean cabeOuNao(char[] receba, char[] metemete){
        boolean cabimento = false;
        if(metemete.length > receba.length){
            return cabimento;
            
        }
        int j = 0;
        for (int i = receba.length - metemete.length; i < receba.length; i++) {
            if(receba[i] != metemete[j]){
                return cabimento;
            }
        }

        cabimento = true;
        return cabimento;
    }
}
