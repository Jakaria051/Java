
//inheritance which inherit the other classes use those classes & getting the advantage

public class Inheritance_basic extends Father {

    public static void main(String[] args) {

        Father obj = new Father();
        obj.sweet();
    }
    
}


//now create a new class & name it Father


public class Father extends Mother {
    
}

//then create a another new class & name it Mother


public class Mother {
    
    public void sweet()
    {
        System.out.println("Lovely");
    }
   
}

