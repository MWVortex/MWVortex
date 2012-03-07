package webradio.serveur;

import java.io.File;
import java.util.ArrayList;

public class ManageurDiscographie {
	
	private static FiltreurMp3EtDossier filtreur = new FiltreurMp3EtDossier();
	
	/**
	 * 
	 * @param dossier: Repertoire contenant les mp3
	 * @return un ArrayList des musiques dans le repertoire
	 */
	static ArrayList<Musique> genererCollection(File dossier){
		ArrayList<Musique> musiques = new ArrayList<>();

    	if (dossier != null){
    		recursion(dossier.listFiles(), musiques);
    	}
    	
    	return musiques;
    }
        
    /*
     * 
     * Boucle qui lit un array de fichiers
     * Si le fichier est un dossier, on applique
     * la recursion pour obtenir le contenu du dossier.
     * Si le fichier n'est pas un dossier, on filtre le 
     * contenu du fichier et on ajoute les mp3 a
     * l'arraylist
     */
    private static void recursion(File[] fichiers, ArrayList<Musique> musiques){	
    	for (int i = 0; i < fichiers.length; i++){
    		
    		if (fichiers[i].isDirectory()){
    			recursion(fichiers[i].listFiles(filtreur), musiques);
    		}
    		else if(filtreur.accept(fichiers[i])){
    			if (fichiers[i].isDirectory()){
    				recursion(fichiers[i].listFiles(filtreur), musiques);
    			}
    				musiques.add(new Musique(fichiers[i]));
    		}
    	}
    }

}
