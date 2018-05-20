
package set_sorted_treeset;

import java.util.Set;
import java.util.TreeSet;

public class SET_SORTED_TreeSet {

    public static void main(String[] args) {
        
        Set <Person> set = new TreeSet<>();
        
        set.add(new Person("Jakaria"));
        set.add(new Person("Rajib"));
        set.add(new Person("Rabel"));
        set.add(new Person("Rokon"));
        set.add(new Person("Rifat"));
        
        
        for(Person p : set)
        {
            System.out.println(p);
        }
    
    }
    
}
