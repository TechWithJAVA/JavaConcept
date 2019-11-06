package com.saroj.designpattaern;

public class EgerSingleton {

	private static volatile EgerSingleton es=new EgerSingleton();
	
	private EgerSingleton() {
		System.out.println("Eger Singleton*******");
	}
	
	public static EgerSingleton getInstance() {
	return es;
	}
}
