package webradio.serveur;


	import java.io.File;
	import java.io.IOException;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import org.jaudiotagger.audio.AudioFileIO;
	import org.jaudiotagger.audio.AudioHeader;
	import org.jaudiotagger.audio.exceptions.CannotReadException;
	import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
	import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
	import org.jaudiotagger.audio.mp3.MP3AudioHeader;
	import org.jaudiotagger.audio.mp3.MP3File;
	import org.jaudiotagger.tag.FieldKey;
	import org.jaudiotagger.tag.TagException;
	import org.jaudiotagger.tag.id3.AbstractID3v2Tag;

	public class Song {

	    private String track = "";
	    private String title = "";
	    private String artist = "";
	    private String album = "";
	    private String year = "";
	    private String label = "";
	    private String composer = "";
	    private String comment = "";
	    private int trackLength = 0;
	    private String trackLengthString = "";
	    private File path = null;

	    public Song() {
	        buildSong(); //popule les variables d'instance
	    }

	    private void buildSong() {
	        try {
	            
	            MP3File f = (MP3File) AudioFileIO.read(new File("C://1.mp3"));
	            MP3AudioHeader audioHeader = (MP3AudioHeader)f.getAudioHeader();
	            AbstractID3v2Tag v2Tag;
	            
	            if (f.hasID3v2Tag()){
	                v2Tag = f.getID3v2Tag();
	                this.track = v2Tag.getFirst(FieldKey.TRACK);
	                this.title = v2Tag.getFirst(FieldKey.TITLE);
	                this.artist = v2Tag.getFirst(FieldKey.ARTIST);
	                this.album = v2Tag.getFirst(FieldKey.ALBUM);
	                this.year = v2Tag.getFirst(FieldKey.YEAR);
	                this.composer = v2Tag.getFirst(FieldKey.COMPOSER);
	                this.comment = v2Tag.getFirst(FieldKey.COMMENT);
	            }
	            trackLength = audioHeader.getTrackLength();
	            trackLengthString = audioHeader.getTrackLengthAsString();
	            
	            System.out.println("track : " + this.track);
	            System.out.println("title : " + this.title);
	            System.out.println("artist : " + this.artist);
	            System.out.println("album : " + this.album);
	            System.out.println("year : " + this.year);
	            System.out.println("composer : " + this.composer);
	            System.out.println("comment : " + this.comment);
	            System.out.println("trackLength : " + this.trackLength);
	            System.out.println("trackLengthString : " + this.trackLengthString);
	            
	        } catch (CannotReadException ex) {
	            Logger.getLogger(Song.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	            Logger.getLogger(Song.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (TagException ex) {
	            Logger.getLogger(Song.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ReadOnlyFileException ex) {
	            Logger.getLogger(Song.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (InvalidAudioFrameException ex) {
	            Logger.getLogger(Song.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	    }
	
}
