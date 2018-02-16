
package polymorphism_basic;

//polymorphism--ekta object bivinnorup daron kore
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
