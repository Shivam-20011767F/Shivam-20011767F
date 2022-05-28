[2:42 PM, 5/26/2022] Arnav Cr: package Unit_03;



/*
 * 
 * Inter-thread Communication:
   - Threads uses wait, notify() and notifyAll() methods from Object Clas
   - command + Shift + T -> Find object class and see its methods
   - command + O -> all methods
 * 
 * */

public class P16_MultiThreading_WaitAndNotify {

	public static void main(String[] args) {

		SharedResource c = new SharedResource();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
//		new Thread() {
//			public void run() {
//				c.withdraw(15000);
//			}
//		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
				//c.deposit(30000);
			}
		}.start();
	}

}

class SharedResource {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.…
[3:33 PM, 5/26/2022] Purvi Cr: package Unit_03;



/*
 * 
 * Inter-thread Communication:
   - Threads uses wait, notify() and notifyAll() methods from Object Clas
   - command + Shift + T -> Find object class and see its methods
   - command + O -> all methods
 * 
 * */

public class P16_MultiThreading_WaitAndNotify {

	public static void main(String[] args) {

		SharedResource c = new SharedResource();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
//		new Thread() {
//			public void run() {
//				c.withdraw(15000);
//			}
//		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
				//c.deposit(30000);
			}
		}.start();
	}

}

class SharedResource {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
		//notifyAll();
	}
}