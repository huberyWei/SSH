package com.david.javaTest;
/**
 * 子线程循环10次，接着主线程循环100次，
 * 接着又回到子线程循环10次，接着再回到主线程循环100次，如此循环50次，请写出程序 
 * @author David
 *
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		new ThreadTest().init();
	}

	public void init() throws InterruptedException {
		final Business business = new Business();
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					business.SubThread(i);
				}
			}
		}).start();
		Thread.sleep(1000); // 此行为了让主线程让出CPU，让子线程先执行
		for (int i = 0; i < 50; i++) {
			business.MainThread(i);
		}
	}

	class Business {
		// boolean bShouldSub=true;
		public synchronized void MainThread(int i) throws InterruptedException {
			for (int j = 0; j < 100; j++) {
				System.out.println(Thread.currentThread().getName() + ":yu_i="+ i + ",j=" + j);
			}
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		public synchronized void SubThread(int i) {
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName()+ ":bing_i=" + i + ",j=" + j);
			}
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
