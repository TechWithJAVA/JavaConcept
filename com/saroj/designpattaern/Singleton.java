package com.saroj.designpattaern;

public class Singleton {

	 private static Singleton limInstance;
	    public static int objCount = 0;

	    private Singleton(){
	        objCount++;
	    }

	    public static synchronized Singleton getInstance(){
	        if(objCount < 3 ){
	            limInstance = new Singleton();
	        }
	        return limInstance;
	    }
	
	public static void main(String[] args) {
		
		/********Singleton Enum*******/
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

		/***********Double checking ***************/
        DoublecheckingSingleton ds=DoublecheckingSingleton.getInstance();
        DoublecheckingSingleton ds1=DoublecheckingSingleton.getInstance();
        if(ds==ds1)
        	System.out.println("Equal");
        
        /************Eger Singleton****************/
        EgerSingleton es=EgerSingleton.getInstance();
        EgerSingleton es1=EgerSingleton.getInstance();
        if(es==es1)
        	System.out.println(true);
        
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		Singleton obj5 = Singleton.getInstance();
		Singleton obj6 = Singleton.getInstance();

	        System.out.println(obj1.hashCode());
	        System.out.println(obj2.hashCode());

	        System.out.println(obj3.hashCode());
	        System.out.println(obj4.hashCode());
	        System.out.println(obj5.hashCode());
	        System.out.println(obj6.hashCode());
		
	}
	
}
