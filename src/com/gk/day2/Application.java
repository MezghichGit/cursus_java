package com.gk.day2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Partie 1 : La classe String
		/*
		 * String ecole = "global knowledge";
		 * 
		 * System.out.println(ecole);
		 * 
		 * System.out.println(ecole.toUpperCase());
		 * 
		 * String formateur = "Mohamed Amine MEZGHICH";// 22 caractères y compris les
		 * espaces
		 * 
		 * System.out.println(formateur);
		 * 
		 * System.out.println(formateur.toLowerCase());
		 * 
		 * System.out.println(formateur.length());
		 * 
		 * System.out.println(formateur.charAt(0));
		 * 
		 * System.out.println(formateur.charAt(formateur.length() - 1)); // dernier
		 * caractère?
		 * 
		 * String mot = "amine";
		 * 
		 * String souschaine = mot.substring(2); // retourne une sous-chaine de la
		 * position 2 jusqu'à la fin de la chaine String souschaine2 = mot.substring(2,
		 * 4); // retourne une sous-chaine entre 2 et 4-1
		 * System.out.println(souschaine); System.out.println(souschaine2);
		 * 
		 * String word = "\t amine mezghich ";
		 * 
		 * System.out.println(word); System.out.println(word.trim()); // la fct trim() :
		 * permet de supprimer les espaces au debut et fin ainsi que les tabulations/
		 * retourn à ligne
		 * 
		 * String w1 = "java"; String w2 = "JAVA"; System.out.println(w1.equals(w2)); //
		 * false System.out.println(w1.equalsIgnoreCase(w2)); // true
		 * 
		 * 
		 * String word = "java"; System.out.println(word.toUpperCase());
		 * System.out.println(word); System.out.println(word.toString());
		 * 
		 * System.out.println(word);
		 * 
		 * word = word.toUpperCase(); // word va pointer vers un autre objet
		 * 
		 * System.out.println(word);
		 */

		// Partie 2 : Les Date & Time
		/*
		 * LocalDate date = LocalDate.now(); System.out.println(date);
		 * 
		 * LocalDate dateAniversaire = LocalDate.of(1985,Month.JULY,10); LocalDate
		 * dateAniversaire2 = LocalDate.of(1985,7,10);
		 * 
		 * System.out.println(dateAniversaire);
		 * 
		 * LocalTime time = LocalTime.now(); System.out.println(time);
		 * 
		 * LocalTime time2 = LocalTime.of(11, 36, 10); System.out.println(time2);
		 * 
		 * LocalDateTime ldt = LocalDateTime.now(); System.out.println(ldt);
		 * 
		 * LocalDateTime ldt2 = LocalDateTime.of(1985, 7, 10, 15, 30);
		 * System.out.println(ldt2);
		 */

		// Exercice n°2 : Faite la saisie de votre date de naissance au clavier
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Donner l'année : ");
		int annee = scanner.nextInt();
		
		System.out.println("Donner le mois: ");
		int mois = scanner.nextInt();
		
		System.out.println("Donner le jour: ");
		int jour = scanner.nextInt();
		
		System.out.println(""+jour+"/"+mois+"/"+annee);
		System.out.println(LocalDate.of(annee, mois, jour)); // format ISO
		*/
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//System.out.println(date.plusYears(3));
		//date = date.plusYears(3);
		//date = date.minusYears(3);
		//System.out.println(date);
		
		Period period = Period.of(2, 1, 10);
		date = date.plus(period);
		System.out.println(date);
		// Partie 3 : Héritage en Java

		// Partie 4 : Les 4 modificateurs de visibilté

	}

}
