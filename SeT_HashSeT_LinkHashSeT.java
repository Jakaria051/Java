
package set_hashset_linkhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jakaria
 */
public class SeT_HashSeT_LinkHashSeT {

 
    public static void main(String[] args) {
      
        Set <String> person = new HashSet<>();  //which is not maintain the odering
        
        person.add("jakaria");
        person.add("rabel");
        person.add("rajib");
        person.add("jahan");
        person.add("jakaria");
        person.add("rajib");
        
        System.out.println("Name of person :"+person);
        System.out.println("Total persons :"+person.size());
        
        
        Set <String> set = new LinkedHashSet<>(); //.maining the ordering how i am going to input
        set.add("jakaria");
        set.add("rabel");
        set.add("rajib");
        
        System.out.println("Name of person :"+set);
        System.out.println("Total persons :"+set.size());
        
        
        Set <Integer> numbers = new TreeSet<>();  ///which is usually use on sorted set
        
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        
        System.out.println(numbers);
        
        
        
    }
    
}
