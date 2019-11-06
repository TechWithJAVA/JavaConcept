package com.saroj.multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {

	public static void main(String[] args) {
		
		ScheduledExecutorService executor1=Executors.newScheduledThreadPool(1);
		executor1.schedule(new Runnable() {
			
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				 System.out.println("Hello " + threadName);
				
			}
		}, 10, TimeUnit.SECONDS);
		executor1.shutdown();
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(2);
		executor.execute(()->{
			String threadName = Thread.currentThread().getName();
			 System.out.println("Hello " + threadName);
		});
		executor.shutdown();
	}
}
