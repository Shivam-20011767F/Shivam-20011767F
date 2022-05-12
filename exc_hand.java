
package Unit_03;

import java.util.Scanner;

public class exc_hand{
	void excep1()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
		System.out.println(2+6);
	}
	void excep2()
	{
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
	catch(Exception e)
	{
		System.out.println("Divide by zero");
	}
		System.out.println(2+6);
	}
	void st_over(int n)
	{
		func(n+1);
	}
	void array_exception()
	{
		int ar[]= {1,2,4,3,5,6,7,8,9};
		try
		{
		System.out.println(ar[ar.length+2]);
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	  void mismatch()
	  {
		  Scanner sc=new Scanner(System.in);
		  int n;
		  System.out.println("Enter n");
		  n=sc.nextInt();
	  }
		void multicatch()
		{
			int a=10;
			int b=0;
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
		catch(Exception e)
		{
			System.out.println("Divide by zero");
		}
			System.out.println(2+6);
		}
		void null_exception()
		{
			exc_hand x=null;
			x.multicatch();
		}
		void null_ptr()
		{
			exc_hand e2=null;
			try {
			e2.null_exception();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
public static void main(String args[])
	{
		exc_hand e1=new exc_hand();
		//e1.excep1();
		//e1.excep2();
		//e1.st_over();
		//e1.array_exception();
	//	e1.mismatch();
		//e1.multicatch();
		e1.null_ptr();
	}
	}

