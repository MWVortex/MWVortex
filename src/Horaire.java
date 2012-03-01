
import java.beans.XMLEncoder;
import java.io.*;


public class Horaire implements Temps {
    
    public String creerPlaylist()throws IOException{
        
        String playList = "termine";
        
        XMLEncoder e = new XMLEncoder(
                            new BufferedOutputStream(
                            new FileOutputStream("Test.xml")));
       e.writeObject("test");
       e.close();
        
        //playList = 
        return playList;
        
    } 
}
