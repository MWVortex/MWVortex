import java.util.Date;


public class Campagne {
	/**
	 * Campagnes publicitaires
	 * Classe qui contenant des blocs de
	 * pubs.
	 * 
	 * Les campagnes auront des conditions
	 * à respecter et permettront la construction
	 * adéquate de playlists
	 */
	
	Date debut; //Debut de la campagne
	Date fin;	//Fin de la campagne. 
	
	public boolean estExpiree(){
		return fin.compareTo(new Date()) > 0;
	}
	
	
	public boolean estCommencee(){
		return debut.compareTo(new Date()) >= 0 ;
	}
	
	public boolean estEnCours(){
		boolean enCours = false;
		
		if (!estExpiree()){
			if (estCommencee()){
				enCours = true;
			}
		}
		
		return enCours;
	}

}
