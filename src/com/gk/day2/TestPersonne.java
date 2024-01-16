package com.gk.day2;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p =  new Personne();
		//p.age = -25;
		p.setAge(-25);
		System.out.println(p.getAge());
		
		p.setAge(25);
		System.out.println(p.getAge());

	}

}
