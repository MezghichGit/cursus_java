package com.gk;

public class TestVoiture {

	public static void main(String[] args) {
		/*
		Voiture v1 = new Voiture(); //création d'une première instance
		
		System.out.println(v1); // adresse de l'objet
		System.out.println(v1.marque); //null
		System.out.println(v1.prix); //0.0
		System.out.println(v1.numCirculation);//0
		System.out.println(v1.modele);  //null
		
		v1.marque = "BMW";
		v1.modele = "X5";
		v1.numCirculation = 200014;
		v1.prix=20000;
		System.out.println("****** après modification *********");
		//System.out.println(v1.marque);
		//System.out.println(v1.modele);
		v1.info();*/
		
		//Correction exo 1
		
		System.out.println(Voiture.nbrTotalVoiture); // = 0
		// Création des 4 voitures en utilisant le constructeur avec paramètres
		
		Voiture v1 = new Voiture("BMW","X5",30000,123);
		Voiture v2 = new Voiture("Mercedes","A180",50000,101023);
		
		System.out.println(Voiture.nbrTotalVoiture); // = 2
		
		Voiture v3 = new Voiture("Renault","Classque",15000,10012024);
		Voiture v4 = new Voiture("Peugeot","3008",25000,20102023);
		
		// Création d'un tableau de 4 voitures
		
		Voiture[] voitures = {v1,v2,v3,v4};
		
		// Boucle pour afficher les 4 voitures
		
		for(int i = 0; i<voitures.length; i++)
		{
			voitures[i].info();
		}
		//System.out.println(Voiture.nbrTotalVoiture);// = 4 //attribut statique (de la classe)
	
		Voiture.getNbreTotalVoiture(); // appel de la méthode static
	}

}
