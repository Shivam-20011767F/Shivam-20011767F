package Unit_03;

import java.util.Scanner;

class multi_th1 extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println(Thread.currentThread().getName());
		sc.close();

	}
}
class multi_th2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("Task 2");
		System.out.println(Thread.currentThread().getName());

	}
}

public class P16_MultiThreading_In_Java {
	public static void main(String args[])
	{
		multi_th1 t1=new multi_th1();
		Thread T1=new Thread(t1,"Thread1");
		
		//Perform Single task using single thread.
		T1.start();
		//Perform Single task using multiple threads.bnb
		multi_th2 t2=new multi_th2();
		Thread T2=new Thread(t2,"Thread2");
				T2.start();
	}


}
