package com.saroj.designpattaern.factory;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeFactory sh=new ShapeFactory();
		Shape shape1 =	sh.getShape("Circle");
		 shape1.draw();
		Shape shape2=sh.getShape("Rectangle");
		shape2.draw();
		
	}
}
