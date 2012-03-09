package webradio.serveur;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * 
 * @author Ralph
 * Classe qui important des répertoires de MP3
 * dans un ArrayList 
 */
public class ImporteurMP3 extends SimpleFileVisitor<Path> {

	private ArrayList<MP3> liste; //ArrayList de travail
	private TypeMP3 type; //Si c'est une Musique ou une Pub

	
	/**
	 * Rajoute tous les MP3 d'un répertoire dans un ArrayList
	 * @param chemin: pointe le répertoire à ajouter
	 * @param array: l'ArrayList à qui rajouter le répertoire
	 * @param type: Si c'est une Musique ou une Pub
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public void ajouterUnRepertoire(Path chemin, ArrayList<? extends MP3> array, TypeMP3 type) throws IOException{
		liste = (ArrayList<MP3>) array;
		this.type = type;
		
		Files.walkFileTree(chemin, this); //Fouille tous les répertoires
		
		array = liste;
		array.trimToSize(); //Réduire taille de l'ArrayList
		
		liste = null; //Pour économiser d'avantage d'espace
	}
	
	/*
	 * Méthode de la classe SimpleFileVisitor.
	 * Cette méthode est requise pour la visite de chaque
	 * répertoire.
	 * @see java.nio.file.SimpleFileVisitor#visitFile(java.lang.Object, java.nio.file.attribute.BasicFileAttributes)
	 */
	@Override
	public FileVisitResult visitFile(Path chemin, BasicFileAttributes attrs){
		
		//Rajoute les MP3 selon de type demandé
		if (chemin.toString().endsWith(".mp3")){
			if (type == TypeMP3.MUSIQUE){
				liste.add(new Musique(chemin));
			} else {
				liste.add(new Pub(chemin));
			}
		}
		
		
		//Continue la recherche	
		return FileVisitResult.CONTINUE;
	}

}
