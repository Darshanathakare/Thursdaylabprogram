//author:darshana thakare
// Java program to reverse and and sum up digits of number
 
package que1;
import java.util.Scanner;
 
 public class reverse{
	 {
		 public void reverse()
		 {
			 Scanner sc = new Scanner(systrm.in);
			 System.out.printIn("\nreverse the didgit");
			 System.out.printIn("\n Enter the which no u want to reverse");
			 int num = sc.nextInt();
			 int rev=0;
			 while(num ! = 0)
			 {
				 int remainder = mun % 10;
				 rev = rev * 10 + remainder;
				 num = num/10;
				 
			 }
		 }
	 }