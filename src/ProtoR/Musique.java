/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtoR;

import java.io.File;
import java.nio.file.Path;

/**
 *
 * @author sophie
 */
public class Musique extends MP3 {
    
    // Hérite de la variable: Path chemin
    
    private int track;
    private String title;
    private String artist;
    private String album;
    private String year;
    private String label;
    private String composer;
    
    public Musique(Path chemin){
        super(chemin);
        
        if (chemin != null) {
            construireMusique();
        }
    }
    
    private void construireMusique(){
        File laMusique = this.chemin.toFile();
        
        /*
         * Remplir variables de l'objet avec
         * IdTagger 
         */
    }

    /**
     * @return the track
     */
    public int getTrack() {
        return track;
    }

    /**
     * @param track the track to set
     */
    public void setTrack(int track) {
        this.track = track;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the composer
     */
    public String getComposer() {
        return composer;
    }

    /**
     * @param composer the composer to set
     */
    public void setComposer(String composer) {
        this.composer = composer;
    }

}
