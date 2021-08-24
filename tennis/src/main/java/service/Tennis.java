package service;

import bean.Joueur;

public class Tennis {	
	
	/**
	 * 
	 * test : 
	 * 		a)champion 
	 * 		b)avantage
	 * 		c)egalit�
	 *      e)jeux continue 
	 * @param scoreA
	 * @param scoreB
	 * @param joueur
	 * @return
	 */
	public String jeux(int scoreA, int scoreB, Joueur joueur) {
		
		String resultat= "";
		
		if (this.champion(scoreA, scoreB, joueur).length() != 0) {
			resultat = this.champion(scoreA, scoreB, joueur);
		} else {
			if (this.avantage(scoreA, scoreB, joueur).length() != 0) {
				resultat = this.avantage(scoreA, scoreB, joueur);
			} else {
				if (this.egalite(scoreA, scoreB).length() != 0) {
					resultat = this.egalite(scoreA, scoreB) +" / " + this.continuerAjouer();
				} else {
					resultat = this.continuerAjouer();
			   }
			}
		}
		
		return resultat;
	}

	/**
	 * cas gagnant : Une partie est gagn�e par le premier joueur � avoir remport� au moins quatre points au total et au moins deux points de plus que l'adversaire. 
	 * @param scoreA
	 * @param scoreB
	 * @param joueur
	 * @return nom joueur ou vide
	 */
	public String champion(int scoreA, int scoreB, Joueur joueur) {

		String champion = "";
		int diff = 2;
		if (scoreA >= 4 || scoreB >= 4) {
			if (scoreA >= scoreB + diff) {
				champion = joueur.getJoueurA() + " est le gagnant";
			}
			if (scoreB >= scoreA + diff) {
				champion = joueur.getJoueurB() + " est le gagnant";
			}
		}
		return champion;
	}
	
	/**
	 * cas �galit� : Si au moins trois points ont �t� marqu�s par chaque joueur et que les scores sont �gaux, le score est � deux �. 
	 * @param scoreA
	 * @param scoreB
	 * @return egalit� ou vide
	 */
	public String egalite(int scoreA, int scoreB) {

		String egalite = "";
		if (scoreA >= 3 && scoreA >= 3) {
			egalite = scoreA == scoreB ? "Egalite" : "";
		}
		return egalite;

	}
	
	/**
	 * cas avantage : Si au moins trois points ont �t� marqu�s par chaque camp et qu'un joueur a un point de plus que son adversaire, le score du jeu est avantage � pour le joueur en t�te. 
	 * @param scoreA
	 * @param scoreB
	 * @param joueur
	 * @return nom joueur ou vide
	 */
	public String avantage(int scoreA, int scoreB, Joueur joueur) {

		String avantage = "";
		if (scoreA >= 3 && scoreB >= 3) {
			if ((scoreA - scoreB) == 1) {
				avantage = joueur.getJoueurA() + " a l'avantage";
			}
			if ((scoreB - scoreA) == 1) {
				avantage = joueur.getJoueurB() + " a l'avantage";
			}
		}
		return avantage;
	}
	
	/**
	 * @return "pas de gagnant, le jeux continue"
	 */
	public String continuerAjouer () {
		return "Pas de gagnant, le jeux continue";
	};

}
