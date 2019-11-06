package com.saroj.designpattaern.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		 //get an object of Shape Rounded Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      shape1.draw();
	      Shape shape2 = shapeFactory.getShape("Circle");
	      shape2.draw();
	      Shape shape3 = shapeFactory.getShape("Square");
	      shape3.draw();
	      
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	    //get an object of Shape Rectangle
	      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape4.draw();
	      //get an object of Shape Square 
	      Shape shape5 = shapeFactory1.getShape("SQUARE");
	      //call draw method of Shape Square
	      shape5.draw();
	}
}
