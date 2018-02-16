

package encapsulation_basic;

//Encapsulation which is minly using on security purpose..
//say for example if a hacker want to hack main class if these class are encapsuted then couldn't access this
//if encapsuted are not available then he will access the class

public class Encapsulation_basic {


    public static void main(String[] args) {
  
        BankClass obj = new BankClass();
        obj.withDrawManeyByPinNum(1234);
        //obj.pinfrombank(4567); u can't access pin of bank from here coz the bankclass is encapsulated
    }
    
}

//now create a new class & named it BankClass

public class BankClass {
    
    private int pinfrombank = 1234;
    
    public void withDrawManeyByPinNum(int pinNum)
    {
        if(pinfrombank == pinNum)
        {
            System.out.println("User will successfully withdrow their money ");
        }
        else
        {
            System.out.println("Paaword given by user is incorrect");
        }
    }
    
}
