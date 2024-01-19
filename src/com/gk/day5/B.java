package com.gk.day5;

public class B extends A{

	@Override  // je redéfinie une méthode de la classe mère avec la même signature
	public void info()
	{
		System.out.println("Je suis un B qui hérite de A");
	}
}
