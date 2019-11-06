package com.saroj.opps;

abstract class FinalMethodInAbstarct {

	public static final void show() {
		System.out.println("Yes");
	}
	public void display() {
		System.out.println("Overriding");
	}
	public abstract void success();
	//public abstract final  void show1();//illegal combination of modifier: abstarct and final
	
	public static void main(String[] args) {
		show();
	}
	
}
