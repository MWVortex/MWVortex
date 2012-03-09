package tests;

import java.io.*;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b

import javax.swing.JFileChooser;

import webradio.serveur.*;

public class TestTrouverMp3 {
	static JFileChooser selecteur = new JFileChooser();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entrer 'r' pour tester un repertoire ");
		System.out.println("Entrer 'm' pour tester une musique");
<<<<<<< HEAD
		System.out.print("Autre chose mettra fin au test: ");
=======
		System.out.println("Autre chose mettra fin au test");
		System.out.println();
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
		
			try {

				switch((char)System.in.read()){
				
				case 'm':
					testUneMusique();
					break;
				case 'r':
					testRepertoireMusique();
					break;
				default:
<<<<<<< HEAD
						System.out.println("Fin test");
=======
					System.out.println("Fin test");
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
		
=======
			
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
	}
	
	/*
	 * Lit un repertoire contenant des musiques
	 * et affiche quelques infos de celles-ci
	 */
	public static void testRepertoireMusique() throws Exception{
		
		selecteur.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		selecteur.showOpenDialog(null);
<<<<<<< HEAD
		File fichier = selecteur.getSelectedFile();
		
		Collection<Musique> disco = new Collection<>(TypeMP3.MUSIQUE);
		
		try {
			disco.importer(fichier.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Musique> muses = disco.getListe();
		
		for (Musique muse: muses){
			System.out.println(muse.getArtist());
			System.out.println(muse.getTitle());
			System.out.println(muse.getAlbum());
			System.out.println(muse.getDureeEnString());
			System.out.println("-------");
		}
		
		System.out.println("Nombre de mp3s: " + muses.size());
=======
		
		File file = selecteur.getSelectedFile();
		MP3Collection.initDiscographie(file);
		
		for (int i = 0; i < MP3Collection.getDiscograhpie().size(); i++){
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getArtist());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getTitle());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getAlbum());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getDureeEnString());
			System.out.println("------");		
		}
		
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	}
	
	/*
	 * Lit une musique et affiche quelques infos
	 */
<<<<<<< HEAD
	public static void testUneMusique(){

=======
	public  static void testUneMusique(){
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		selecteur.showOpenDialog(null);
		
		Musique muse = new Musique(selecteur.getSelectedFile().toPath());
		
		System.out.println(muse.getArtist());
		System.out.println(muse.getTitle());
		System.out.println(muse.getAlbum());
		System.out.println(muse.getDureeEnString());
<<<<<<< HEAD

=======
		
>>>>>>> a77e764d4ec4f24afd74de816bc8f89683eda81b
	}

}
