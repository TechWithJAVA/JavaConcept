package com.saroj.designpattaern.factory;

public class SedanCar extends CarFactory{

	SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
