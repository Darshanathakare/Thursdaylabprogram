//Author: Darshana Thakare
//Program to print first and last digit of a number

package question1;

public class Number {

	public static void main(String[] args) {
		    {  
		        int number = 502356997;
		        int firstDigit = 0;
		        int lastDigit = 0;
		 
		        lastDigit = number%10;
		        System.out.println("Last digit: "+lastDigit);
		 
		        while(number!=0) {
		            firstDigit = number%10;
		            number /= 10;
		        }
		        System.out.println("First digit: "+firstDigit);
		    }
		}
	}

