package com.gk;

import java.util.Scanner;

import com.gk.exo1.Animal;



public class LectureClavier {

	public static void main(String[] args) {
		
		//Correction exo 2
		
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Taper l'espece de l'animal");
				String espece = scanner.nextLine(); // nextLine() : méthode qui permet de lire une chaine de caractère depuis le clavier
				
				System.out.println("Taper age de l'animal");
				int age = scanner.nextInt(); // nextInt(): permet de lire à partir du clavier un entier
				
				Animal a1 = new Animal(espece, age);
				System.out.println(a1); // appel de la méthode toString()
		
		//Lire une information depuis le clavier
		/*
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Quel est votre nom svp? ");
		
		
		String nom = scanner.nextLine();
		
		System.out.println("Vous êtes : "+nom);*/
		
		

	}

}
