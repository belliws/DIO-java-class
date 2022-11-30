import java.util.Scanner;

class QuadradosPerfeitos{
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];
        int total, count, countTotal;
        
        for(int i = 0; i<d.length-1; i++ ){
            if (i*i<=n){
                d[i]=i*i;
            }
            else{
                i=d.length-1;
            }
        }
            countTotal = 1000;
            for (int i = d.length - 1; i> 0 && i <= n; i--) {

                if (i >0 && d[i] > 0) {
    
                    total = n;
                    count = 0;
    
                    for (int j = i; j > 0; j--) {
    
                        while (total > 0) {
                            if (total >= d[j]) {
                                total = total - d[j];
                                count++;
                            } else {
                                j--;
                            }
                        }
                    }                
                    if (countTotal > count) {
                        countTotal = count;
                    }
                }            
            }
            System.out.println(countTotal);
            

            
    }
}
