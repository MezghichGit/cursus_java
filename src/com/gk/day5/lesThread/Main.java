package com.gk.day5.lesThread;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new EnvoisMail());
		t1.start();

		Thread t2 = new Thread(new EnvoisSMS());
		t2.start();
		
		EnvoisBip t3 = new EnvoisBip();
		t3.start();

	}

}
