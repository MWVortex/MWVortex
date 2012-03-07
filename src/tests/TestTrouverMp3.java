package tests;

import java.io.*;

import javax.swing.JFileChooser;

import webradio.serveur.*;

public class TestTrouverMp3 {
	static JFileChooser selecteur = new JFileChooser();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input;
		System.out.print("Entrer 'r' pour lire un repertoire" +
				"ou 'm' pour lire un seule musique: ");
		
		
		
<<<<<<< HEAD
=======
		System.out.println("Entrer r pour tester un repertoire ");
		System.out.println("Entrer m pour tester une musique");
		System.out.println("Autre chose mettra fin au test");
		System.out.println();
		
		while (tester == true){
>>>>>>> 4021ec4a7d573cfc10bece7c5a855fcf005e1ef0
			try {
				
				input = (char)System.in.read();

				switch(input){
				case 'm':
					testUneMusique();
					break;
				case 'r':
					testRepertoireMusique();
					break;
				default:
						System.out.println("Fin test");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
	
	/*
	 * Lit un repertoire contenant des musiques
	 * et affiche quelques infos de celles-ci
	 */
	public static void testRepertoireMusique() throws Exception{
		
		selecteur.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		selecteur.showOpenDialog(null);
		
		File file = selecteur.getSelectedFile();
		MP3Collection.initDiscographie(file);
		
		for (int i = 0; i < MP3Collection.getDiscograhpie().size(); i++){
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getArtist());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getTitle());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getAlbum());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getDureeEnString());
			System.out.println("------");		
		}
		
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	}
	
	/*
	 * Lit une musique et affiche quelques infos
	 */
	public  static void testUneMusique(){
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		selecteur.showOpenDialog(null);
		
		Musique muse = new Musique(selecteur.getSelectedFile().toPath());
		
		System.out.println(muse.getArtist());
		System.out.println(muse.getTitle());
		System.out.println(muse.getAlbum());
		System.out.println(muse.getDureeEnString());
		
	}

}
