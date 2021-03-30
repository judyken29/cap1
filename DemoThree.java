package p1;
import java.util.Scanner;
public class DemoThree {
	public static void main(String[] args)
	{
		Scanner j = new Scanner(System.in);
		System.out.print(" Enter  date");
		int date = j.nextInt();
		
		if((date <= 0)|| (date > 31))
			System.out.print(" Invalid ");
		else
		{ if(date==11||date==12||date==13)
			System.out.print(date+"th");
		  else {
			int r = date % 10;
			if(r==1)
				System.out.print(date+"st");
			else if (r==2)
				System.out.print(date+"nd");
			else if (r==3)
				System.out.print(date+"rd");
			else
				System.out.print(date+"th");
		}
		}
		

}
} 
