package com.saroj.multithreading;

public class ThreadLocalTest {
	public static class MyRunnable implements Runnable {
        private ThreadLocal<Integer> threadLocal =
               new ThreadLocal<Integer>();
        @Override
        public void run() {
            threadLocal.set( (int) (Math.random() * 100D) );  
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }  
            System.out.println(threadLocal.get());
        }
    }


	public static void main(String[] args) throws InterruptedException {
		
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread t1 = new Thread(sharedRunnableInstance);
        Thread t2 = new Thread(sharedRunnableInstance);
        t1.start();
        t2.start();
        t1.join(); //wait for thread 1 to terminate
        t2.join(); //wait for thread 2 to terminate
		
	}
}
