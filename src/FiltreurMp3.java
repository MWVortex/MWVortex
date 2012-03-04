


import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sophie
 */
public class FiltreurMp3 implements FilenameFilter {
	
	/**
	 * N'accepte que les fichiers mp3 d'un répertoire
	 * @param dir: Le fichier, name: Nom du fichier
	 * @return fichier est un mp3
	 */
    @Override
    public boolean accept(File dir, String name) {
        boolean valide = false;
        
        if (dir != null && name.endsWith(".mp3")){
            valide = true;
        }
        
        
        return valide;
    }
    
}
