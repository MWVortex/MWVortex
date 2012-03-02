public class Vortex {
    
    private static String configuration = "sc_trans.conf"; 
    
    static Membres membres;


    public static void main(String[] args) {

        membres = new Membres();
        boolean login = membres.login("Sophie", "chosebinne");
        System.out.print(login);
    }
}
