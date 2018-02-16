


package interface_basic;

///interface we can say as example as music player ..when we play music it will run the program..when we want
///to stop we click on stop button it'll stop..this is called interface..
///interface which will implement forcefully to done their job


///if the method name are same but body differnt then it will called over-riding
//if the method name are same & parametar are different  then it will called over-loading

public class Interface_basic implements MusicPlayer {

 
    public static void main(String[] args) {
        
     
    }

    public void play(String name) {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void stop() {
        
    }

    @Override
    public void back() {
        
    }

    @Override
    public void play(int id) {
        
    }
    
}


//now create a new class named it MusicPlayer

public interface MusicPlayer {
    ///if the class are interface then it will 100% abstruct class
    
    public void play(int id);
    public void pause();
    public void stop();
    public void back();
    
    
}
