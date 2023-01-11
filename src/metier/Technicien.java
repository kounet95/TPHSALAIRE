package metier;

public class Technicien extends Employer {	
	
	private final static double FACTEUR_UNITE =5;
	private int unites;
	
	

	public Technicien(String nom, String prenom, int age, String date, int unites) {
		super(nom, prenom, age, date);
		this.unites = unites;
	}


	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return unites*FACTEUR_UNITE;
	}
	
	public String getTitre() {
		return "technicien";
	}


}
