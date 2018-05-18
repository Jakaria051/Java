package valid_invalid_variable;

import static java.lang.Character.isDigit;
import java.util.Scanner;

public class Check_If_String_or_digit {

    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        String str;
        int n1=0,ch1=0,ch2=0;
        str = in.next();
        
       
        for(int i=0;i<str.length();i++)
        {
           char ch = str.charAt(i);
           
           if(ch>='0' && ch<='9' && ch !='.')
           {
               n1=1;
           }
           else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
           {
               ch1=1;
           }
          
           else
           {
               ch=3;
           }
        }
        
        
        
        if(n1==1 && ch1 != 1)
        {
            System.out.println("Number");
        }
        else if(ch1==1 && n1 != 1)
        {
            System.out.println("Character");
        }
       
        else
            System.out.println("Character Stream");
      
    }
    
}
