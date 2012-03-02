/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arcturus
 */
import java.io.File;
//import org.jaudiotagger.tag.id3.ID3v1Tag;
public class Song {
    
    int track = 0;
    private String title = "";
    private String artist = "";
    private String album = "";
    private String year = "";
    private String label = "";
    private String composer = "";
    private File path = null;
    
    public Song(){
        buildSong(); //popule les variables d'instance
        
        track = this.track;
        title = this.title;
        artist = this.artist;
        album = this.album;
        year = this.year;
        label = this.label;
        composer = this.composer;
        path = this.path;
    }
    
    private void buildSong(){
        //TODO
    }
}
