package com.gk.day3;

import java.util.Arrays;

public class LesCollections {

	public static void main(String[] args) {

		//Les tableaux
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
		System.out.println(Arrays.binarySearch(t2, 30));
	}

}
