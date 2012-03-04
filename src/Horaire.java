/**
 * Gère les plages horraire
 *
 * @author Nicolas Foisy
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Horaire implements Temps {
    
    private String nomPlaylist;
    private String startTime;
    private long duree;

    /**
     * Créer une nouvel plage horaire
     * 
     * @param startTime l'heure du début de la playlist
     * @param duree la durée de la playlist
     */
    public Horaire ( String nomPlaylist, String startTime, long duree ){
        setNomPlaylist( nomPlaylist );
        setStartTime( startTime );
        setDuree( duree );      
    } 
    
    /**
     * Génère le nom de la playlist en fonction de la date et de l'heure 
     * 
     * @param nomPlaylist l'heure du début de la playlist
     */
    public void setNomPlaylist( String nomPlaylist ){
        
    }  
    
    /**
     * Modifie le startTime de la playlist. 
     * 
    * @param startTime l'heure du début de la playlist
     */
    public void setStartTime( String startTime ){
        this.startTime = startTime;
    }  
    
    /**
     * Modifie la durée de la playlist.
     * 
     * @param duree la durée de la playlist
     */
    public void setDuree( long duree ){
        this.duree = duree;
    } 

   /**
    * Méthode qui génère du XML dans un fichier à partir des données recueillies 
    */
    public String creerXml(){ 
      return("");
    }

	@Override
	public long getDuree() {
		// TODO Auto-generated method stub
		return duree;
	} 
}
