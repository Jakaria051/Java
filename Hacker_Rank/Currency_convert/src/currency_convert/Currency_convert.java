
package currency_convert;
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;
public class Currency_convert {

    public static void main(String[] args) {

          Scanner in=new Scanner(System.in);
          Double  payment= in.nextDouble();
          in.close();
          
          String us =    NumberFormat.getCurrencyInstance(Locale.US).format(payment);
          String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
          String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
          String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
          System.out.println("US: " + us);
          System.out.println("India: " + india);
          System.out.println("China: " + china);
          System.out.println("France: " + france);
        
        
        }
    
}
