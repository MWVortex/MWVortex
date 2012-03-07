package webradio.serveur;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.File;
import java.nio.file.Path;


/**
 *
 * @author sophie
 */
public class Pub extends MP3 {
	
	//Herite des variable: Path chemin et long duree
    
    public Pub(Path chemin) {
        super (chemin);
    }
    
    public Pub(File chemin){
    	super (chemin.toPath());
    }

}
