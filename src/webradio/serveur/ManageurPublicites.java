package webradio.serveur;

import java.io.File;
import java.util.ArrayList;

public class ManageurPublicites {

	
	/*
	 * Voir ManageurDiscographie pour les commentaires
	 */
	
	private static FiltreurMp3 filtreur = new FiltreurMp3();
	
	static ArrayList<Pub> genererCollection(File dossier){
		ArrayList<Pub> pubs = new ArrayList<>();

    	if (dossier != null){
    		recursion(dossier.listFiles(), pubs);
    	}
    	
    	return pubs;
    }
        
    
    private static void recursion(File[] fichiers, ArrayList<Pub> pubs){	
    	for (int i = 0; i < fichiers.length; i++){
    		
    		if (fichiers[i].isDirectory()){
    			recursion(fichiers[i].listFiles(filtreur), pubs);
    		}
    		else if(filtreur.accept(fichiers[i])){
    				pubs.add(new Pub(fichiers[i]));
    		}
    	}
    }
}
