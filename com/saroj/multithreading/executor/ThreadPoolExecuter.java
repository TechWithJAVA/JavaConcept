package com.saroj.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecuter {
public static void main(String[] args) {
	
	ExecutorService executor=Executors.newFixedThreadPool(5);
		
		executor.execute(new Runnable() {
		public void run() {
			System.out.println("Annyomous Task");
		}
		});
			
	executor.shutdown();
	
	ExecutorService executor1 = Executors.newSingleThreadExecutor();
	executor1.submit(() -> {
	    String threadName = Thread.currentThread().getName();
	    System.out.println("Hello " + threadName);
	});
	executor1.shutdown();
	
	ExecutorService executor2 = Executors.newCachedThreadPool();
	executor2.execute(()->{
		String threadName = Thread.currentThread().getName();
	    System.out.println("Hello " + threadName);
	});
	executor2.shutdown();
}
}
