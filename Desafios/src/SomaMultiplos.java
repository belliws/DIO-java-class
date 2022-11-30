import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
       
        int A, N;

        Scanner imput = new Scanner(System.in);

        A = imput.nextInt();
        N = imput.nextInt();


        int somaMultiplos = 0;
        
      for (int i = A;i <= N; i = i + A){
        somaMultiplos = somaMultiplos + i;
      }
      
      System.out.println(somaMultiplos);
    }
    
}
