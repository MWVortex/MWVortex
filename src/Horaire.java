public class Horaire implements Temps {
    
    private String nomDj; 
    private String startTime;
    private String duration;

    /**
     * Créer une nouvel plage horaire
     */
    public Horaire (String nomDj, String startTime, String duration ){
        setNomDj( nomDj );
        setStartTime( startTime );
        setDuration( duration );      
    } 
    
    /**
     * Modifie le nom du DJ. 
     */
    public void setNomDj( String nomDj ){
        this.nomDj = nomDj;
    }
    
    /**
     * Modifie le startTime. 
     */
    public void setStartTime( String startTime ){
        this.startTime = startTime;
    }  
    
    /**
     * Modifie la durée. 
     */
    public void setDuration( String duration ){
        this.duration = duration;
    } 

   /**
    * Méthode qui génère du XML dans un fichier à partir des données recueillies 
    */
    public String creerXml(){ 
      return("");
    } 
}
