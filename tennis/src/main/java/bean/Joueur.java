package bean;

public class Joueur {
	
	String joueurA;
	String joueurB;
	
	public Joueur() {
		
	}
	public Joueur(String joueurA, String joueurB) {

		this.joueurA = joueurA;
		this.joueurB = joueurB;
	}
	public String getJoueurA() {
		return joueurA;
	}
	public void setJoueurA(String joueurA) {
		this.joueurA = joueurA;
	}
	public String getJoueurB() {
		return joueurB;
	}
	public void setJoueurB(String joueurB) {
		this.joueurB = joueurB;
	}

}
