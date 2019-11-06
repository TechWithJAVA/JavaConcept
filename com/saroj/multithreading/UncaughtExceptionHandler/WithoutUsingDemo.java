package com.saroj.multithreading.UncaughtExceptionHandler;

public class WithoutUsingDemo {

	public static void main(String[] args) {

	Thread t=new Thread(()->{
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("125"));
	//	System.out.println(Integer.parseInt("xyz"));
		System.out.println(Integer.parseInt("127"));
	});
	t.start();
	}
}
