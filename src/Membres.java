
/**
 * Gère les membres qui ont accès au logiciel
 *
 * @author Sophie Déziel
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Membres {

    private static String configuration = "membres.conf";
    FileReader fr = null;

    public Membres() {
        System.out.print(login("dj", "noise"));
    }

    /**
     * Retire un membre
     * @return boolean true si successful
     */
    public boolean retirer(String pseudo) {
        return false;
    }

    /**
     * Ajoute un membre.
     * Retourne true si l'opération a fonctionné. Le membre ne doit pas déjà 
     * exister, et le pseudo ne doit pas contenir de caractères 
     * invalides ( seulement [a-zA-Z0-9-_).
     *
     * @param pseudo
     * @param pass
     * @return boolean, true si l'ajout s'est bien effectué
     */
    public boolean ajouter(String pseudo, String pass) {
        return false;
    }

    /**
     * Vérifie la combinaison pseudo/mot de passe.
     * Retourne true si le mot de passe correspond au login.
     * 
     * @param pseudo
     * @param pass
     * @return true lorsque l'utilisateur existe et a le bon mot de passe
     */
    public boolean login(String pseudo, String pass) {
        boolean connect = false;
        int id = existe(pseudo);
        if (id >= 1) {
            try {
                fr = new FileReader(configuration);
                BufferedReader br = new BufferedReader(fr);
                String s;
                while ((s = br.readLine()) != null) {
                    if (s.startsWith("djpassword_" + id) && s.endsWith("="+pass)) {
                        connect = true;
                    }
                }
                fr.close();
            } catch (IOException ex) {
            } 

        }
        return connect;
    }

    /**
     * Vérifie que le membre existe bien, et retourne son index. S'il n'existe
     * pas, il retourne -1.
     *
     * @param pseudo
     * @return index
     */
    public int existe(String pseudo) {
        int index = -1;
        try {
            fr = new FileReader(configuration);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                if (s.startsWith("djlogin_") && s.endsWith(pseudo)) {
                    String[] infos = s.split("djlogin_");
                    infos = infos[1].split("=");
                    index = Integer.decode(infos[0]);
                }
            }
            fr.close();
        } catch (IOException ex) {
        } 
        return index;
    }

    /**
     * Vérifie si le membre a les droits administrateurs
     *
     * @param pseudo
     * @return
     */
    public boolean estAdmin(String pseudo) {
        return false;
    }
    
    public void setAdmin(String pseudo, boolean droit){
        
    }
    
    private void compte(){
        
    }
    
}
