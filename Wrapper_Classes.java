package Unit_01;

public class Wrapper_Classes {
	public static void main(String args[])
	{
		int a=25;
		Integer b=a;
		Integer c=Integer.valueOf(a);
		
		Integer x=new Integer(50);
		int y=x.intValue();
		int z=x;
		System.out.println(a+" "+b+" "+c);
		System.out.println(x+" "+y+" "+z);
	}
}
