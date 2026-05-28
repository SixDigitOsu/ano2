import java.util.Scanner;

public class b1234 {
        final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while(LER.hasNext()){
            String sentenca = LER.nextLine();
            char[] c = sentenca.toCharArray();
            c = danca(c);
            sout(c);
            
        }

    }
    public static void sout(char [] c){
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
    public static char[] danca(char [] c){
        boolean upper = false;
      
        for (int i = 0; i < c.length; i++) {
            if(Character.isLowerCase(c[i])){
                upper = false;
              }
           if(upper == false){
            c[i] = Character.toUpperCase(c[i]);
            upper = true;
           }
        }
        return c;
    }
}
