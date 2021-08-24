package main;

import bean.Joueur;
import service.Tennis;


public class Lancement {

	public static void main(String[] args) {
		
		Tennis test  = new Tennis();
		Joueur joueur = new Joueur("Jean Marc", "David" );
		System.out.println(  "TEST 1 " + test.jeux(4, 2, joueur));
		System.out.println(  "TEST 2 " + test.jeux(4, 3, joueur));
		System.out.println(  "TEST 3 " + test.jeux(3, 3, joueur));
		System.out.println(  "TEST 4 " + test.jeux(2, 2, joueur));

	}

}