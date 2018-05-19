package list_arraylist_and_vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author jakaria
 */
public class List_ArrayList_and_Vector {

    public static void main(String[] args) {
       
        List <String> person = new ArrayList<>();
       
         person.add("jac");
        person.add("jakaria");
        person.add("rabel");
        person.add("rajib");
        person.add("jahan");
        System.out.println("Name of person :"+person);
        System.out.println("Total persons :"+person.size());
        
        String SecondPerson = person.get(1);
        
        System.out.println("Seconds persons name :"+SecondPerson);
        
        person.set(2,"Tusar");  ///lets change the name of rabel
        
        System.out.println("Name of person :"+person);
        
        person.remove(3);
        person.remove("jahan");
        
        System.out.println("After Removing -- Name of person :"+person);
        
        int intexofjakaria = person.indexOf("jakaria");
        
        System.out.println("intexofjakaria : "+intexofjakaria);
        
        
        //VectorTest
        
        List <String> vector = new Vector<>();
        
        vector.add("JacK");
        vector.add("Jakaria");
        vector.add("Love");
        
        System.out.println("Name of person :"+vector);
        System.out.println("Total persons :"+vector.size());
        
        
    }
    
}
//
