import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        
         String palavraInvertida = "";
        
        for(int i = palavra.length() - 1; i>=0; i--){
          palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if(palavra.equals(palavraInvertida)){
        System.out.println("TRUE");
        }
        else{
          System.out.println("FALSE");
        }
    }
}

