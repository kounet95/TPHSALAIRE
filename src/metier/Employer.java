package metier;

public abstract class Employer {
private String nom;
private String prenom;
private int age;
private String date;

public Employer(String nom, String prenom, int age, String date) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.date = date;
}
abstract public double calculerSalaire();
public String getTitre() {
	return "Employer";
}
public String getNom() {
	
	return getTitre()+ nom+prenom;
}

}
