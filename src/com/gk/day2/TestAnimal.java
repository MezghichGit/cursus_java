package com.gk.day2;

public class TestAnimal {

	public static void main(String[] args) {
		Poisson p1 =  new Poisson();
		
		//System.out.println(p1.espece);  // erreur car c'est private
		
		System.out.println(p1.age);
		
		System.out.println(p1.poids); // visibilité package private
		
		System.out.println(p1.nom);

	}

}
