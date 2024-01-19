package com.gk.day5.complements;

public class MethodeGenerique {

	
	public static <T> void display(T t)  //méthode générique
	{
		System.out.println(t);
	}
	
	
	
	public static void main(String[] args) {
		display("OCP");
		display(18);
		display(new Etudiant("Amine",38));
		
		Conteneur<String> cn = new Conteneur<>("GK");
		
		Conteneur<Integer> ci = new Conteneur<>(20);

	}

}
