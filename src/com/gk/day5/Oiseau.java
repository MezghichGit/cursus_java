package com.gk.day5;

public class Oiseau extends Animal{

	@Override  // Annotation : best practice
	public void seDeplacer()
	{
		System.out.println("Je vol");
	}

}
