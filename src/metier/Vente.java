package metier;

public class Vente extends Commercial {
	final static double POURCENTAGE_VENTE=0.2; 
	final static int BONUS_VENTE=400;
	
	public Vente(String nom, String prenom, int age, String date, double chiffreDaffaire) {
		super(nom, prenom, age, date, chiffreDaffaire);
		
	}
		

	public double calculerSalaire() {
		return  getChiffredAffaire() * POURCENTAGE_VENTE + BONUS_VENTE;
		
	}
	
	public String getTitre() {
		return "Vendeur";
	}
		
}
