//author:darshana thakare
// Java program to reverse and and sum up digits of number
 
package que1;
import java.util.Scanner;
 
 public class reverse{
	 {
		 public void reverse()
		 {
			
			 
			   
			    public static void main(String[] args)
			    {
			        
			        int num, rem;
			 
			        
			        int rev = 0, sum = 0;
			 
			        
			        System.out.println("Enter the number: 25 ");
			 
			        num = 25;
			 
			        
			        do {
			 
			            
			            rem = num % 10;
			 
			            // Step2: Reverse the number
			            rev = rev * 10 + rem;
			 
			            // Sum of the digits of number
			            sum = sum + rem;
			 
			            // Step3: Dividing number by 10 to lose last
			            // digit
			            num = num / 10;
			        }
			 
			        // Condition check
			        // Remember: By this time 1 iteration is over even
			        // if conditions false
			        while (num > 0);
			 
			        // Printing the reverse number
			        System.out.println("Reverse of given number: "
			                           + rev);
			 
			        // Summing up digits of number as shown in above
			        // steps
			        System.out.println("Sum of digits of given number: "
			                           + sum);
			    }
			}