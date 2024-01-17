package com.gk.day3;

import java.time.Month;

public class LesTypesJava {

	public static void main(String[] args) {
		
		// En Java, on a 8 types primitifs
		//Les entiers
		byte x = 10;  // sur 8 bits
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		short y = 1000;   // sur 16 bits
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int a = 32;  // sur  32 bits
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long l = 64; // code sur 64 bit;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		// Les réels
		float h = 12.5f;  //codé sur 32 bits
		double t = 12.5; // codé sur 64 bits
		
		char lettre = 'a';
		boolean test =true;
		
		// Les types références : se sont les classes
		
		// Les types références build-in (du langage)
		// Exemple : Scanner, System, String...
		
		// Les types références custom (spécifique, créer par le développeur)
		//Exemple : la classe Banque, CompteBancaire, Animal...
		
		
		// Les types Enum, Exemple Month de java.time
		
		Month mois = Month.JULY;
		
		System.out.println(mois);
		
		Mention m = Mention.EXELLENT;
		System.out.println(m);
		Mention.nbreMentions();
	}

}
