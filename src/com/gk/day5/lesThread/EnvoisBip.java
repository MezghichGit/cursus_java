package com.gk.day5.lesThread;

public class EnvoisBip extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Envois de Bip n° : "+i);
		}
		
	}
}
