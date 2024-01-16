package com.gk.exo1;

import java.util.Scanner;

import com.gk.day2.Poisson;

public class TestAnimal {

	public static void main(String[] args) {
		Poisson p1 =  new Poisson();
		
		//Correction exo 2
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taper l'espece de l'animal");
		String espece = scanner.nextLine(); // nextLine() : méthode qui permet de lire une chaine de caractère depuis le clavier
		
		System.out.println("Taper age de l'animal");
		int age = scanner.nextInt(); // nextInt(): permet de lire à partir du clavier un entier
		
		Animal a1 = new Animal(espece, age);
		System.out.println(a1); // appel de la méthode toString()
		
		/*
		Animal chien = new Animal("Chien",3);
		Animal poisson = new Animal("Dorate",1);
		Animal oiseau = new Animal("Canari",4);
		
		Animal [] animaux = {chien,poisson,oiseau};
		
		for(int i=0; i<animaux.length;i++)
		{
			System.out.println(animaux[i]);  // appel de la méthode toString
		}
		
		System.out.println("Total Animaux = "+Animal.total);*/
		//System.out.println(chien);
		//System.out.println(chien.toString());

	}

}
