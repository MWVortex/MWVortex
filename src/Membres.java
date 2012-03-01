/**
 * Gère les membres qui ont accès au logiciel
 * @author Sophie Déziel 
 *
 */
import java.io.*;

public class Membres {
    private static String configuration;
    
    public Membres(String conf){
        configuration = conf;
    }
    
    /**
     * Retire un membre
     * @return boolean true si successful
     */
    public boolean retirer(String pseudo) {
        return false;
    }

    /**
     *Ajoute un membre
     * @param pseudo
     * @param pass
     * @return boolean, true si l'ajout s'est bien effectué
     */
    public boolean ajouter(String pseudo, String pass) {
        return false;
    }

    /**
     * 
     * @param pseudo
     * @param pass
     * @return true lorsque l'utilisateur existe et a le bon mot de passe
     */
    public boolean login(String pseudo, String pass) {
        return false;
    }
    /**
     * Vérifie que le membre existe bien, et retourne son index. S'il n'existe 
     * pas, il retourne -1.
     * @param pseudo
     * @return index
     */
    public int existe(String pseudo) {
        return -1;
    }
    /**
     * Vérifie si le membre a les droits administrateurs
     * @param pseudo
     * @return 
     */
    public boolean estAdmin(String pseudo) {
        return false;
    }
}
