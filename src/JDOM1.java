import java.io.*;
import org.jdom.*;
import org.jdom.output.*;

public class JDOM1
{
   //Nous allons commencer notre arborescence en créant la racine XML
   //qui sera ici "personnes".
   static Element racine = new Element("personnes");

   //On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
   static org.jdom.Document document = new Document(racine);

   public static void main(String[] args)
   {
      //On crée un nouvel Element etudiant et on l'ajoute
      //en tant qu'Element de racine
      Element etudiant = new Element("etudiant");
      racine.addContent(etudiant);

      //On crée un nouvel Attribut classe et on l'ajoute à etudiant
     //grâce à la méthode setAttribute
      Attribute classe = new Attribute("classe","P2");
      etudiant.setAttribute(classe);

      //On crée un nouvel Element nom, on lui assigne du texte
      //et on l'ajoute en tant qu'Element de etudiant
      Element nom = new Element("nom");
      nom.setText("CynO");
      etudiant.addContent(nom);

      //Les deux méthodes qui suivent seront définies plus loin dans l'article
      affiche();
      enregistre("Exercice1.xml");
   }
}