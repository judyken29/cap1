package p1;

import java.util.Scanner;

public class DemoOne {
 
 public static void main(String[] args) {
  Scanner j = new Scanner(System.in);
   
  System.out.print("Input first sub marks: ");
  int num1 = j.nextInt();
  System.out.print("Input second sub marks: ");
  int num2 = j.nextInt();
  System.out.print("Input third sub marks: ");
  int num3 = j.nextInt();
  System.out.print("Input fourth sub marks: ");
  int num4 = j.nextInt();
  System.out.print("Enter fifth sub marks: ");
  int num5 = j.nextInt();
  int sum=num1+num2+num3+num4+num5;
  System.out.println("Sum is"+sum);
  double avg=(sum)/5;
  System.out.println("Average of five numbers is: " +avg);
 }
}
 
