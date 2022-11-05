import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        
       while(true){

        System.out.println("Iniciar tabuada? (S ou N) ");
        String repetir = scan.next();
        if (repetir.equals("N")) break;

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i<=10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            }
        }
    
        

        System.out.println("Fim");
    }
    
}
