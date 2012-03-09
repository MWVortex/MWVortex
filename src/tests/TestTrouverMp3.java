package tests;

import java.io.*;
import java.util.ArrayList;

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
		System.out.print("Autre chose mettra fin au test: ");
		
			try {

				switch((char)System.in.read()){
				
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
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	}
	
	/*
	 * Lit une musique et affiche quelques infos
	 */
	public static void testUneMusique(){

		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		selecteur.showOpenDialog(null);
		
		Musique muse = new Musique(selecteur.getSelectedFile().toPath());
		
		System.out.println(muse.getArtist());
		System.out.println(muse.getTitle());
		System.out.println(muse.getAlbum());
		System.out.println(muse.getDureeEnString());

	}

}
