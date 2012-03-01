
/**
 * Gère les membres qui ont accès au logiciel
 * @author Sophie Déziel 
 *
 */
public class Membres implements Configurable {

    @Override
    public void importer() {
    }

    @Override
    public void exporter() {
    }

    /**
     * Retire un membre
     *
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
     * Vérifie que le membre existe bien
     * @param pseudo
     * @return 
     */
    public boolean existe(String pseudo) {
        return false;
    }
    /**
     * Vérifie si le membre a les droits administrateurs
     * @return 
     */
    public boolean estAdmin() {
        return false;
    }
}
