package com.gk;

public class Application {

	public static void main(String[] args) {
		// Affichage de message sur l'écran
		
		//System.out.println("Hello Promo Java 2024");
		
		String formation = "Cursus Java";
		String formateur = "Mohamed Amine MEZGHICH";
		String centreFormation = "Global Knowledge";
		int nbreStagiaires = 15;
		double nbreHeuresTotal = 250.5;
		
		System.out.println("Infos sur la formation : "+formation+", Formateur : "+formateur+", Centre : "+centreFormation); //message mixte
		System.out.println("Nbre Stagiaires : "+nbreStagiaires+", Nbre d'heures total : "+nbreHeuresTotal);
		
		String[] stagiaires = {"Ibtissem","Anne","Ahmed","Hu","Afef","Ayda","Andrei","Pierre","Fatima","Teddy","Jocelyn","Abdel","Benoit","Rahma","Khalifa"};
		
		System.out.println("Total stagiaires : "+stagiaires.length); // length : c'est une propriété sur les tableaux
		
		
		for(int i=0; i<stagiaires.length;i++)
		{
			System.out.println(stagiaires[i]);
		}
		/*
		System.out.println(formation);
		System.out.println(formateur);
		System.out.println(centreFormation);
		System.out.println(nbreStagiaires);
		System.out.println(nbreHeuresTotal);*/

	}

}
