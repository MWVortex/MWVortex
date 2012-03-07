package tests;

import java.io.File;
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
		boolean tester = true;
		
		while (tester == true){
			try {
				switch(System.in.read()){
				case 'm':
					testUneMusique();
					break;
				case 'r':
					testRepertoireMusique();
					break;
				default:
					System.out.println("Fin test");
					tester = false;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getAlbum());
			System.out.println(((Musique)MP3Collection.getDiscograhpie().get(i)).getDureeEnString());
					
		}
		
		selecteur.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	}
	
	/*
	 * Lit une musique et affiche quelques infos
	 */
	public  static void testUneMusique(){
		selecteur.showOpenDialog(null);
		Musique muse = new Musique(selecteur.getSelectedFile().toPath());
		System.out.println(muse.getArtist());
		System.out.println(muse.getAlbum());
		System.out.println(muse.getDureeEnString());
		
	}

}
