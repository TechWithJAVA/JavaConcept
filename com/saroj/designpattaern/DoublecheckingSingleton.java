package com.saroj.designpattaern;

public class DoublecheckingSingleton {

	private static DoublecheckingSingleton ds;
	
	private DoublecheckingSingleton() {
		System.out.println("double checking singleton");
	}
	
	public static DoublecheckingSingleton getInstance() {
		
        if (null == ds) {
        	synchronized (DoublecheckingSingleton.class) {
				if(ds==null) {
					 ds = new DoublecheckingSingleton();
				}
			}
        }
        return ds;

	}
}
