package com.gk.day5.lesThread;

public class EnvoisMail extends Object implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Envois de Mail n° : "+i);
		}
		
	}

}
