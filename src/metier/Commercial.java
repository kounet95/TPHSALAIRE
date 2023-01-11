package metier;

public  abstract class Commercial extends Employer {

private double chiffreDaffaire;
	public Commercial(String nom, String prenom, int age, String date,double chiffreDaffaire) {
		super(nom, prenom, age, date);
		this.chiffreDaffaire=chiffreDaffaire;
		
	}

public double getChiffredAffaire() {
	return chiffreDaffaire;
}


	

}
