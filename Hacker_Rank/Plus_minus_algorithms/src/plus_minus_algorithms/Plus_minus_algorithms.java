
package plus_minus_algorithms;
import java.util.*;
import java.io.*;
public class Plus_minus_algorithms {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i;
        float positive=0,negative=0,zero=0;
        int count=0;
        float array[]=new float[n];
        for( i=0;i<n;i++)
        {
            array[i]=in.nextInt();
            if(array[i]>0)
         
             positive++; 
         
            
         else if(array[i]<0)
         
              negative++; 
           
          else
             zero++;
        
        }
        
        
          System.out.printf("%.6f\n%.6f\n%.6f\n ",positive/n,negative/n,zero/n);
    }
    
}
