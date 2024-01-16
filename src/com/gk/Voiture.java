package com.gk;

public class Voiture {

	// Les attributs d'instance

	String marque;
	String modele;
	int numCirculation;
	double prix;
	static int nbrTotalVoiture;

	// Les constructeurs : une méthode spéciale permettant de créer notre
	// objet(instance)

	public Voiture() // constructeur par défaut
	{
		nbrTotalVoiture = nbrTotalVoiture +1;
		System.out.println("Nouvelle voiture vide");
	}
	
	public Voiture(String mq, String mdl, double pr, int numc) //constructeur avec paramètres
	{
		nbrTotalVoiture = nbrTotalVoiture +1;
		marque = mq;
		modele = mdl;
		numCirculation = numc;
		prix = pr;
	}

	// méthodes d'instance

	public void info() {
		System.out.println("Marque : " + marque + " Modèle : " + modele + " NumCirculation : " + numCirculation
				+ " prix : " + prix);
	}
	public double prixVoiture() {
		return prix;
	}
	public String marqueVoiture() {
		return marque;
	}
	
	public static void getNbreTotalVoiture()
	{
		System.out.println(nbrTotalVoiture);
	}
}
