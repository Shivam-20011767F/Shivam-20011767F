package Unit_03;

import java.io.*;
import java.util.*;
public class P15_FileHandling_In_Java {
	public static void main(String args[])throws IOException
	{
		int fc=0;
		File f=new File("C:\\Users\\Shivam\\samp.txt");
		try
		{
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
				String line=sc.next();
				fc++;
				for(int i=0;i<line.length();i++)
				{
				if((line.charAt(i)=='.'||line.charAt(i)==',')&&i!=line.length()-1)
					fc++;
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		System.out.println("Number of words are "+fc);
	}
}
