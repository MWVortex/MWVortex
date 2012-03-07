package webradio.serveur;


import java.io.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sophie, Ralph
 */
public class FiltreurMp3EtDossier implements FilenameFilter {
	
	/**
	 * N'accepte que les fichiers mp3 d'un répertoire
	 * ET LES RÉPERTOIRES dans ce répertoire
	 * @param dir: Le fichier, name: Nom du fichier
	 * @return fichier est un mp3
	 */
    @Override
    public boolean accept(File dir, String name) {
        boolean valide = false;
        
        if (dir != null){
	        if (name.endsWith(".mp3") || dir.isDirectory()){
	            valide = true;
	        } 
        }
        
        return valide;
    }
    
    /**
     * 
     * @param fichier: fichier a filtrer
     * @return idem que l'autre accept
     */
    public boolean accept(File fichier){
    	return accept(fichier, fichier.getName());
    }
    
}
