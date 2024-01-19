package com.gk.day5.complements;

public class Etudiant {
	String nom;
	int age;
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}

}
