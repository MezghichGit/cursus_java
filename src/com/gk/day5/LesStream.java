package com.gk.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LesStream {

	public static void main(String[] args) {
		/*
		String nom1 = "pmine";
		String nom2 = "amine";
		
		System.out.println(nom1.compareTo(nom2));
		//0 si les deux objets sont identique
		// nombre négatif lorsque nom1 < nom2
		// nombre positif si nom1 > nom2
		Integer n1 = new Integer(12);
		Integer n2 = new Integer(10);
		System.out.println(n2.compareTo(n1));*/
		
		List<String> list = new ArrayList<>();
		list.add("pierre");
		list.add("anne");
		list.add("afef");
		list.add("derwich");
		list.add("teddy");
		list.add("benoit");
		System.out.println(list);
		
		//Version 8: API Stream
		//Stream<String> names = Stream.of("pièrre","anne","afef","derwich"); // création d'un stream
		Stream<String> names = list.stream();
		//names.map(x->x.toUpperCase()).forEach(System.out::println);  // :: méthode de référence
		//names.filter(x->x.contains("r")).sorted().forEach(System.out::println);
		
		long nbr = names.filter(x->x.contains("r")).peek(System.out::println).count();
		System.out.println(nbr);
		//names.forEach(System.out::println);
		
		

	}

}
