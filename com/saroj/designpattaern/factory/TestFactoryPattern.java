package com.saroj.designpattaern.factory;

public class TestFactoryPattern {

	public static void main(String[] args) {
		  System.out.println(Car.buildCar(CarType.SMALL));
	        System.out.println(Car.buildCar(CarType.SEDAN));
	        System.out.println(Car.buildCar(CarType.LUXURY));
	}
}
