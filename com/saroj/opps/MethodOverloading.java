package com.saroj.opps;

public class MethodOverloading {

	public void m1() {
		System.out.println("no value");
	}
   public void m1(int a) {
		System.out.println(a);
	}
  
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
				m.m1();
				m.m1(10);
		
	}
}


