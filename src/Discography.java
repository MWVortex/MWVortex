/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sophie
 */

import java.util.ArrayList;

public class Discography<T> implements TdaDiscography<T>{

    private ArrayList<T> discographyList = new ArrayList<T>();
    
    @Override
    public void toFile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void empty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T addArtist(T artist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T addAlbum(T album) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T addSong(T song) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void refresh() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T removeArtist(T artist) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T removeAlbums(T album) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T removeSong(T song) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
