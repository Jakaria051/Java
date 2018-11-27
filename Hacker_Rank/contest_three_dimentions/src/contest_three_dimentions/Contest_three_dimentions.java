
package contest_three_dimentions;
import java.util.*;
import java.io.*;
public class Contest_three_dimentions {

    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        int sum=1;
             for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum=sum*arr[i];
        }
        System.out.println((sum*4)/1024);
    
    }
     }
       
 
