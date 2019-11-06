package com.saroj.multithreading;

public class CreateThread {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(i);
				}
				
			}
		});
		//t.start();
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		});
		t1.start();
		
	}
}
