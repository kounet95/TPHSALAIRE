package metier;

public class Manutention extends Employer {
	private int nbHeure;
	private static final int BONUS=65;
	
	public Manutention(String nom, String prenom, int age, String date, int nbHeure) {
		super(nom, prenom, age, date);
		this.nbHeure=nbHeure;
	}

	@Override
	public double calculerSalaire() {
		return nbHeure * BONUS;
	}
	
	public String getTitre() {
		return "MANUTENTION";
		
	}
}
