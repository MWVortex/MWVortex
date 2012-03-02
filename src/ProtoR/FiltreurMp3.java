package ProtoR;


import java.io.File;
import java.io.FilenameFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sophie
 */
public class FiltreurMp3 implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        boolean valide = false;
        
        if (dir != null && name.endsWith(".mp3")){
            valide = true;
        }
        
        return valide;
    }
    
}
