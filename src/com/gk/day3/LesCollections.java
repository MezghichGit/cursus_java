package com.gk.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class LesCollections {

	public static void main(String[] args) {

		//1)Les tableaux
		/*
		String[] names = { "amine", "fatima", "benoit" };  //déclaration + création + initialisation
		
		String tab[] = new String[3]; // déclaration création d'un tableau avec 3 cases + initialisation par des null
		
		//System.out.println(tab[0]);
		
		// Initialisation du tableau
		tab[0] = "Fatima";
		tab[1] = "Mohamed";
		tab[2] = "Amine";
		
		for(String name : tab)  // foreach
		{
			System.out.print(name+"\t");
		}
		
		Arrays.sort(tab);
		System.out.println();
		for(String name : tab)  // foreach
		{
			System.out.print(name+"\t");
		}
		
		double moy[] = {12.5,15.5,3,18,14};
		Arrays.sort(moy);
		
		System.out.println();
		
		for(double v : moy)  // foreach
		{
			System.out.print(v+"\t");
		}
		System.out.println();
		int t[] = {3,14,20,30};
		System.out.println(Arrays.binarySearch(t, 8));
		System.out.println(Arrays.binarySearch(t, 30));
		System.out.println(Arrays.binarySearch(t, 21));
		
		int t2[] = {32,14,220,30};
		System.out.println(Arrays.binarySearch(t2, 30));*/
		
		//2)Les collections
		
		ArrayList<String> students  = new ArrayList<>(); // tableau dynamique
		System.out.println(students.size()); // size = nombre d'elements
		System.out.println(students.isEmpty()); // boolean
		
		students.add("Amine");  // add : permet d'ajouter des elements
		students.add("Pierre");
		students.add("Benoit");
		System.out.println(students);
		students.remove("Amine");
		System.out.println(students);
		students.add(0, "Ismail");
		System.out.println(students);
		students.remove(1);
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.isEmpty());
		
		
		ArrayList<Integer>valeurs = new ArrayList<>();
		valeurs.add(12);
		valeurs.add(20);
		valeurs.add(30);
		System.out.println(valeurs);
		/*
		ArrayList  col  = new ArrayList();
		col.add("amine");
		col.add(12);
		col.add(true);
		System.out.println(col);*/
	}

}
