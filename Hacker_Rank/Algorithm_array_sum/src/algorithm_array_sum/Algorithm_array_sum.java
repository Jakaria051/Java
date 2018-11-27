
package algorithm_array_sum;
import java.util.Scanner;
public class Algorithm_array_sum {

    public static void main(String[] args) {
       
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
         int array[]=new int[n];
          long sum=0;
          for(int i=0;i<n;i++)
          {
              array[i]=in.nextInt();
              sum=sum+array[i];
          }
          System.out.println(sum);
          
    }
    
}
