package webradio.serveur;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 
 * @author Sophie Déziel
 * 
 */
public interface Configurable {
    
    abstract void importer(Path repertoire) throws IOException;
    abstract void exporter();
    
}
