/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.nio.file.Path;


/**
 *
 * @author sophie
 */
public abstract class MP3 implements Comparable<MP3>, Temps{

    protected Path chemin;
    protected long duree;
    protected long id;
    static protected long idGenerator = 0;
    
    public MP3(Path chemin){
        
        this.chemin = chemin;
        id = idGenerator;
        idGenerator ++;
        
    }
    
    /**
     * @return the path
     */
    public Path getPath() {
        return chemin;
    }

    /**
     * @param path the path to set
     */
    public void setPath(Path chemin) {
        this.chemin = chemin;
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    
    @Override
    public long getDuree(){
        return duree;
    }
    
       @Override
    public int compareTo(MP3 autre){
        int comparaison = 0;
        
        if (autre != null){
            if (this.id > autre.id){
                comparaison = 1;
            } else if (this.id < autre.id){
                comparaison = -1;
            }
        } else {
            throw new ArithmeticException("Mp3 est null");
        }
        return comparaison;
    }
}
