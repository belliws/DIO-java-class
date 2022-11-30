import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String args[]) {
          
        Scanner imput = new Scanner(System.in);
         int i, corda;
         int N = imput.nextInt();
            int [] nums = new int[N]; //nums = nums[N]
             for (i = 0; i < N; i++)
             {
                 nums[i] = imput.nextInt();
             }
       for (i = 0; i <N; i++) {
        if(nums[i] %2!= 0){
            for(int j = (i+1); j<N; j++ ){
                if(nums[j] % 2 == 0){
                    corda = nums[i];
                    nums[i] = nums[j];
                    nums[j] = corda;
                    j = N;
                }
            }
        }  
       }
        for(i=0; i<N;i++){
            System.out.println(nums[i]);
            
            }   
     }
    
}
