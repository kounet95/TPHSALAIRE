package metier;

public class Representation extends Commercial {
	
	final static double POURCENTAGE_REPRESENTANT=0.2;
	final static int BONUS_REPRESENTANT=800;
	
	public Representation(String nom, String prenom, int age, String date, 
			double chiffreDaffaire) {
		super(nom, prenom, age, date, chiffreDaffaire);
		
	}
	
	public double calculerSalaire() {
		return  getChiffredAffaire() * POURCENTAGE_REPRESENTANT + BONUS_REPRESENTANT;
		
	}
	
	public String getTitre() {
		return "representant";
	}

}
