package com.gk.day5.complements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void display(List<String>list) //méthode polymorphe
	{
		System.out.println(list);
	}

	public static void main(String[] args) {
		/*
		List<String> notes1 = new ArrayList<>();
		List<String> notes3 = new LinkedList<>();
		
		 display(notes1);
		 display(notes3);
		// 0)List vs ArrayList vs LinkedList
		/*
		List<String> list1 = new ArrayList<>(); // se base sur un  tableau dynamique
		List<String> list2 = new LinkedList<>(); // se base liste chaines
		list1.add("amine");
		list2.add("amine");*/
		
		//List<Integer> notes1 = new ArrayList<>();
		/*
		notes1 = new LinkedList<>();
		
		ArrayList<Integer> notes2 = new ArrayList<>();
		
		//notes2 = new LinkedList<>();
		List<Double> moyenne = new ArrayList<>();*/
		
		/*Map<String,Integer>annuaire = new HashMap<>();
		annuaire.put("Amine",51363634);
		annuaire.put("Mohamed",98787521);
		System.out.println(annuaire);*/
		
		Map<Etudiant, Integer> dictionnaire = new HashMap<>();
		dictionnaire.put(new Etudiant("amine",38), 123);
		dictionnaire.put(new Etudiant("mohamed",25), 456);	
		System.out.println(dictionnaire);
	}

}
