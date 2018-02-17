
package thread_basic;

public class Thread_basic {

    public static void main(String[] args) {
      
        Thread thread = new Thread()
        {
            public void run()
            {
            for(int i=0;i<100;i++)
            {
                System.out.println("After Sleep time "+i*10);
            
            try
            {
                sleep(1000);
                
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            }
            }
        
        };
    
        thread.start();
    }
    
}
