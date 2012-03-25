package webradio.serveur;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author Sophie, Ralph
 */
public class Collection <E extends MP3> implements Configurable {
	
	private ArrayList<E> liste; 
	public TypeMP3 type; //Détermine le type de la collection 
	private ImporteurMP3 importeur; 
	
	/**
	 * 
	 * @param type: Collection de Musiques ou de Pubs
	 */
	public Collection(TypeMP3 type){
		liste = new ArrayList<>();
		importeur = new ImporteurMP3();
		this.type = type;
	}
	
	/**
	 * Importe un répertoire de MP3
	 */
    @Override
    public void importer(Path repertoire) throws IOException {
    	if (repertoire != null){
    		importeur.ajouterUnRepertoire(repertoire, getListe(), type);
    	} else {
    		throw new NullPointerException("Chemin est null");
    	}
    }

    @Override
    public void exporter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	public ArrayList<E> getListe() {
		return liste;
	}

    
}
