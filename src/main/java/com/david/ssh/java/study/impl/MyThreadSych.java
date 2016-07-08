package com.david.ssh.java.study.impl;

public class MyThreadSych implements Runnable {
	private Foo foo = new Foo();

	public int fix(int y) {
		return foo.fix(y);
	}

	@Override
	public void run() {
			this.fix(30);
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
			System.out.println(Thread.currentThread().getName()
					+ " : 当前foo对象的x值= " + foo.getX());
	}

	public static void main(String[] args) {
		MyThreadSych sy1 = new MyThreadSych();
		Thread t1 = new Thread(sy1, "thread t1");
		Thread t2 = new Thread(sy1, "thread t2");
		t1.start();
		t2.start();

	}
}

class Foo {
	private int x = 100;

	public int getX() {
		return x;
	}

	public int fix(int y) {
		synchronized (this) {
			
			x = x - y;
			System.out.println(Thread.currentThread().getName()
					+ " :x= " + x);
		}
		return x;
	}
}
