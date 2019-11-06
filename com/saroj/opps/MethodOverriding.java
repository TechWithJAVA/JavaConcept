package com.saroj.opps;

public class MethodOverriding {

	public void m1() {
		System.out.println("parent m1");
	}
	
	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();
		m.m1();
		MethodOverriding mf=new FirstClass();
		mf.m1();
		MethodOverriding ms=new SecondClass();
		ms.m1();
	}
}
class FirstClass extends MethodOverriding{
	public void m1() {
		System.out.println("childFirstClass m1");
	}
}
class SecondClass extends MethodOverriding{
	public void m1() {
		System.out.println("childSecondClass m1");
	}
}
