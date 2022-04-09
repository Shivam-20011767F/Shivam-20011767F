
package Unit_01;
import java.util.*;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("The Options Are:");
		System.out.println("1 Current Year");
		System.out.println("2 Current Month");
		System.out.println("3 Current Day");
		System.out.println("4 Not Applicable");
		System.out.println("Enter your choice");
		c=sc.nextInt();
		switch(c)
		{
		case 1:System.out.println("2022");
		break;
		case 2:System.out.println("4");
		break;
		case 3:System.out.println("8");
		break;
		case 4:System.out.println("Not Applicable");
		break;
		default:System.out.println("Wrong Choice");
		}
	}
}