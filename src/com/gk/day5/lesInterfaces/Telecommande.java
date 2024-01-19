package com.gk.day5.lesInterfaces;

public interface Telecommande {
	
	// avant la version 8
	// des services = méthodes sbtraites
	
	public  void allumerTV(); // abstraite
	
	public  void augmenterVolume(); // abstraite
	
	public  void changerChaine();// abstraite
	
	public  void eteindreTV();// abstraite
	
	// à partir de la version 8, on peut déclarer des méthode concretes avec default ou static
	
	public default void info()
	{
		
	}
	
	public static void infoStatic()
	{
		
	}
	
	// a partir de la version 9
	
	private  void infoP()
	{
		
	}
	
	private static void infoStaticP()
	{
		
	}

}
