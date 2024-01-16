package com.gk.day2;

public class Personne {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20) {
			this.age = age;
		} else {
			System.out.println("Erreur dans la valeur de l'age!");
		}
	}

}
