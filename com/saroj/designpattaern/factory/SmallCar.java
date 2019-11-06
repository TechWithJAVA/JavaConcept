package com.saroj.designpattaern.factory;

public class SmallCar extends CarFactory{

	 SmallCar() {
	        super(CarType.SMALL);
	        construct();
	    }
	 
	    @Override
	    protected void construct() {
	        System.out.println("Building small car");
	        // add accessories
	    }
}
