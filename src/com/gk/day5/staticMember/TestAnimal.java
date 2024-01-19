package com.gk.day5.staticMember;

public class TestAnimal {

	public static void main(String[] args) {
	System.out.println(Animal.nbr); // première méthode
	Animal.getNbre();
	
	Animal a1 = new Animal();
	a1.nbr = 2;  // deuxième méthode
	a1.getNbre();

	}

}
