/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arcturus
 */
public interface TdaDiscography<T> {
    
    /**
     * Transforme la collection en un fichier a definir.
     */
    public abstract void toFile();
    
    /**
     * Vide la collection entiere
     */
    public abstract void empty();
    
    /**
     * Verifie si la collection est vide.
     */
    public abstract boolean isEmpty();
    
    /**
     * ajouter un artiste, albums, chansons.
     */
    public abstract T addArtist(T artist);
    
    /**
     * ajouter un artiste, albums, chansons.
     */
    public abstract T addAlbum(T album);
    
    /**
     * ajouter un artiste, albums, chansons.
     */
    public abstract T addSong(T song);
    
    /**
     * Rafraichie la collection entiere.
     */
    public abstract void refresh();
    
    /**
     * Supprime un artist, albums, chansons de la collection
     */
    public abstract T removeArtist(T artist);
    
    /**
     * Supprime un artist, albums, chansons de la collection
     */
    public abstract T removeAlbums(T album);
    
    /**
     * Supprime une chanson de la collection
     */
    public abstract T removeSong(T song);
    
    /**
     * Transforme la collection en chaine de caractere.
     */
    @Override
    public abstract String toString();
            
}
