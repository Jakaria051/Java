
package number5;
import java.util.Scanner;
public class Number5 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1= in.next();
            int j = in.nextInt();
         System.out.printf("%-15s%03d%n", s1, j);
        }
      System.out.println("================================");
    }
    
}
