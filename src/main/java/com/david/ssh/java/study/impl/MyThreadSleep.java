package com.david.ssh.java.study.impl;


public class MyThreadSleep extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
			if (i % 10 == 0 ) {
				System.out.println("--------"+i);
			}
			/*try {
				Thread.sleep(1);
				System.out.println("sleep 1 ms");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThreadSleep t1 = new MyThreadSleep();
		t1.start();
		t1.join();//当前线程加入阻塞队列即main方法进入阻塞状态，主线程只有等到线程t1执行完才可以进入可执行状态
		MyThreadSleep t2 = new MyThreadSleep();
		t2.start();

		for(int x=1; x<100; x++)
		{
		   System.out.println(Thread.currentThread().getName() + "..." + x);
		}
	}
}
