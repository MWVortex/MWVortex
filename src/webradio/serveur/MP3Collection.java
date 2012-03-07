package webradio.serveur;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Phenix
 */

import java.io.File;
import java.io.*;
import java.util.ArrayList;


public class MP3Collection {
	
	private static ArrayList<Musique> discographie;
	private static ArrayList<Pub> publicites;
	
	public static ArrayList<Musique> getDiscograhpie() {
		return discographie;
	}

	public static ArrayList<Pub> getPublicites() {
		return publicites;
	}
	
	/// Demarreurs
	
	/**
	 * Demarre les collections de pubs et de musiques
	 * 
	 * @param File repMusiques: dossier contenant des musiques
	 * @param File repPubs: dossier contenant des pubs
	 * @throws Exception 
	 */
	public static void initLesCollections(File repMusiques, File repPubs) throws Exception{
		initDiscographie(repMusiques);
		initPublicites(repPubs);
	}
	
	/*
	 * Pour demarrer les ArrayList separement
	 */
	
	public static void initDiscographie(File repertoire) throws Exception{
		if (repertoire != null){
			if (discographie == null || discographie.isEmpty()){
				discographie = ManageurDiscographie.genererCollection(repertoire);
			} else {
				throw new Exception ("Discographie deja initee");
			}
		} else {
			throw new NullPointerException("Repertoire non-valide");
		}
	} 
	
	public static void initPublicites(File repertoire) throws Exception{
		if (repertoire != null){
			if (publicites == null || publicites.isEmpty()){
				publicites = ManageurPublicites.genererCollection(repertoire);
			} else {
				throw new Exception ("Publicites deja initee");
			}
		} else {
			throw new NullPointerException("Repertoire non-valide");
		}
	}
	
	//// Ajout de dossiers
	
	/**
	 * Rajoute un dossier contenant des musiques dans la discographie
	 * @param repertoire: Repertoire contenant des musiques
	 * @throws IOException
	 */
	public static void ajouterRepetoireMusiques(File repertoire) throws IOException{
		if (repertoire != null && repertoire.isDirectory()) {
			if (discographie == null){
				discographie = new ArrayList<>();
			}
			discographie.addAll(ManageurDiscographie.genererCollection(repertoire));
		} else {
    		throw new IOException("Repertoire non-valide");
    	}
	}
	
	/**
	 * Rajoute un dossier contenant des pubs dans la collection de pubs
	 * @param repertoire: Repertoire contenant des pubs
	 * @throws IOException
	 */
    public static void ajouterRepetoirePubs(File repertoire) throws IOException{
    	if (repertoire != null && repertoire.isDirectory()){
    		if (publicites == null){
    			publicites = new ArrayList<>();
    		}
    		publicites.addAll(ManageurPublicites.genererCollection(repertoire));
    	} else {
    		throw new IOException("Repertoire non-valide");
    	}
    }

}
