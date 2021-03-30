package p1;
import java.util.Scanner;
public class DemoTwo {
	public static void main(String [] args) {

	double tax;	
	Scanner j = new Scanner(System.in);
	System.out.print("Enter basic salary");
	double bsal=j.nextDouble();
	double HRA=0.4*bsal;
	System.out.print("HRA  "+HRA   +'\n');
	
	double DA= (bsal+HRA);
	System.out.print("DA  "+DA +'\n');
	if (bsal<200000)
	{
		 tax=0;
	}
	else if (bsal>=200000 && bsal<=600000)
	{
		 tax=(bsal-200000)*0.1;
	}
	else 
	{
		 tax=(bsal-600000*0.2)+(400000*0.1);
	}
	System.out.print("Tax    " +tax);
}
}
