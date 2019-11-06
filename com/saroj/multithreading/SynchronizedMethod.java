package com.saroj.multithreading;

public class SynchronizedMethod {

	synchronized void printTable(int n) {
		   for(int i=1;i<=5;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }   
			 }  
	public static void main(String[] args) {
		
		Runnable r1=()-> {
			new SynchronizedMethod().printTable(5);
		};
		Thread t1=new Thread(r1);
		
		Runnable r2=()-> {
			new SynchronizedMethod().printTable(100);
		};
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
			
		final String resource1 = "ratan jaiswal";  
	    final String resource2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t3 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	            try { Thread.sleep(100);} catch (Exception e) {}  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	    // t2 tries to lock resource2 then resource1  
	    Thread t4 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  
	          try { Thread.sleep(100);} catch (Exception e) {}  
	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  
	    t3.start();  
	    t4.start();  

	}
}
