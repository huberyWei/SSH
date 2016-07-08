package com.david.ssh.java.study;

public class SellThread implements Runnable {
	int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("obj :" + Thread.currentThread().getName()
						+ " sell tickets " + tickets);
				tickets--;
			}

		}

	}

}