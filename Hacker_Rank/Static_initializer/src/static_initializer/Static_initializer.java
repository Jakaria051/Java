
package static_initializer;
import java.util.Scanner;
public class Static_initializer {

     public static int B = 1;
public static int H = 1;
public static boolean flag = true;
static {
	Scanner scan = new Scanner(System.in);
	B = scan.nextInt();
	H = scan.nextInt();
        if (flag) {
            System.out.println(H * B);
        }
	scan.close();
	if (B <= 0 || H <= 0) {
		flag = false;
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
   }
    public static void main(String[] args) {
      
        
        
        
    }
    
}
