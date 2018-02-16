
package polymorphism_basic;

//polymorphism--ekta object bibin-norup daron kore
public class PolyMorphism_basic {

    public static void main(String[] args) {
        
        MyFather obj1 = new MyFather();
        MyFather obj2 = new MyBrother();
        MyFather obj3 = new MyFriend();
        
        obj1.test();
        obj2.test();
        obj3.test();
      
    }
    
}


///now create new class named it MyFriend

//sub class
public class MyFriend extends MyFather {
    
     public void test()  //override method
    {
        System.out.println("Hello World ....from My Friend class");
    }
    
}


//then create new class named it MyBrother


//sub class
public class MyBrother extends MyFather {
    
     public void test()   //override method
    {
        System.out.println("Hello World ....from My Brother class");
    }
    
}


///finally create new class named it MyFather

//super class
public class MyFather {
    
    public void test()
    {
        System.out.println("Hello World ....from My father class");
    }
    
}




///output

Hello World ....from My father class
Hello World ....from My Brother class
Hello World ....from My Friend class
