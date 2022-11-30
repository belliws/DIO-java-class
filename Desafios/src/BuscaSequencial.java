import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int x = leitor.nextInt();
        int count = 0;
      
         while(count <= elementos.length -1){
          
             if(x == elementos[count]){
             System.out.println("Achei " + elementos[count] + " " + "na posicao " + count);
             break;
                  }
                  count++;
            
             if(count == 10){
               System.out.println("Numero " + x + " nao encontrado!");
                  }
                }
  }
    
}
