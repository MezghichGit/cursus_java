package com.gk.exo1;

public class Animal {

	//attributs d'instance
	
	public String espece;
	public int age;
	
	// attribut static
	public static int total;
	
	//constructeur avec 2 paramètres
	public Animal(String espece, int age) {
		
		this.espece = espece;
		this.age = age;
		total++;
	}

	@Override  // on redefinie la méthode de la classe mère Object(qui affiche le hashCode)
	public String toString() {
		return "Animal [espece=" + espece + ", age=" + age + "]";
	}
	
}
