package com.saroj.designpattaern.factory;

public class LuxuryCar extends CarFactory {

	 LuxuryCar() {
	        super(CarType.LUXURY);
	        construct();
	    }
	 
	    @Override
	    protected void construct() {
	        System.out.println("Building luxury car");
	        // add accessories
	    }
}
