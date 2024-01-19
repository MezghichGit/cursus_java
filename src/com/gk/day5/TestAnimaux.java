package com.gk.day5;

public class TestAnimaux {

	public static void main(String[] args) {
		//Impossible d'instancier une classe abstraite
		//Animal a = new Animal();
		Animal animals[] = new Animal[4];  // tableau polymorphe
		animals[0] = new Oiseau();
		animals[1] = new Poisson();
		animals[2] = new Serpent();
		animals[3] = new Chien();
		
		for(Animal a : animals)
		{
			a.dormir();
			a.seDeplacer();
			System.out.println("***");
		}
		
	}

}
