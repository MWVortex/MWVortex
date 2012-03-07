package webradio.serveur;

import java.io.*;
import java.nio.file.Path;

import org.jaudiotagger.audio.exceptions.*;
import org.jaudiotagger.audio.mp3.*;
import org.jaudiotagger.tag.*;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;


/**
 *
 * @author sophie
 */
public class Musique extends MP3 {
    
    // Hérite de la variable: Path chemin et long duree
    
    private String track;
    private String title;
    private String artist;
    private String album;
    private String year;
    private String label;
    private String composer;
	private String comment;
	private String dureeEnString;
    
	/**
	 * @param le chemin de la musique
	 */
    public Musique(Path chemin){
        super(chemin);
        
        //Remplir les tags si le chemin est non null
        if (chemin != null) {
            construireMusique();
        }
    }
    
    /**
     * @param: Le fichier pointant a la musique
     */
    public Musique(File chemin){
    	this(chemin.toPath());
    }
    
    /**
     * Rempli les tags 
     */
    private void construireMusique(){        

        MP3File musique;
		try {
			musique = new MP3File(chemin.toFile());
	
	        if (musique.hasID3v2Tag()){
	        	AbstractID3v2Tag v2Tag = musique.getID3v2Tag();
	        	
	            this.track = v2Tag.getFirst(FieldKey.TRACK);
	            this.title = v2Tag.getFirst(FieldKey.TITLE);
	            this.artist = v2Tag.getFirst(FieldKey.ARTIST);
	            this.album = v2Tag.getFirst(FieldKey.ALBUM);
	            this.year = v2Tag.getFirst(FieldKey.YEAR);
	            this.composer = v2Tag.getFirst(FieldKey.COMPOSER);
	            this.comment = v2Tag.getFirst(FieldKey.COMMENT);
	            
	            MP3AudioHeader audioHeader = musique.getMP3AudioHeader();
	            duree = audioHeader.getTrackLength();
	            setDureeEnString(audioHeader.getTrackLengthAsString());
	        } 
	        
		} catch (IOException  | ReadOnlyFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAudioFrameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    /*
     * Les setters peuvent etre supprimer si voulu
     */

    /**
     * @return the track
     */
    public String getTrack() {
        return track;
    }

    /**
     * @param track the track to set
     */
    public void setTrack(String track) {
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDureeEnString() {
		return dureeEnString;
	}

	public void setDureeEnString(String dureeEnString) {
		this.dureeEnString = dureeEnString;
	}

}
