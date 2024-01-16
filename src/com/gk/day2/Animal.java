package com.gk.day2;

public class Animal {
	
	// attributs d'instance
	private String espece;
	public int age;
	double poids;  // un modificateur package-private
	protected String nom;
	
	// méthodes d'instance
	
	public void manger()
	{
		System.out.println("J'ai fain je veux manger");
	}
	
	
	public void info()
	{
		System.out.println(this.espece+ this.age + this.poids + this.nom);
	}
	

}
