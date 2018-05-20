
package priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

    public static void main(String[] args) {
   
        Queue <Person> set = new PriorityQueue<>();
        
        set.offer(new Person("Person 1",14));
        set.offer(new Person("Person 2",40));
        set.offer(new Person("Person 3",10));
        set.offer(new Person("Person 4",50));
        set.offer(new Person("Person 5",9));
        
        while(!set.isEmpty())
        {
            Person person = set.poll();
            print_method(person);
        }
    }

    private static void print_method(Person person) {
        
        System.out.println("Person name : "+person.getName()+" , age : "+person.getAge());
    }
    
}
