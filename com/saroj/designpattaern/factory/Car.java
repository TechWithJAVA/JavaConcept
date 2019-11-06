package com.saroj.designpattaern.factory;

public class Car {

	public static CarFactory buildCar(CarType model) {
		
		CarFactory car=null;
			        switch (model) {
			        case SMALL:
			            car = new SmallCar();
			            break;
			 
			        case SEDAN:
			            car = new SedanCar();
			            break;
			 
			        case LUXURY:
			            car = new LuxuryCar();
			            break;
			 
			        default:
			            // throw some exception
			            break;
			        }
			        return car;
	}
}
