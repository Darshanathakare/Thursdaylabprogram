//Author: Darshana Thakare
//Program to count the no. of palindrome words in a string
package question7;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
		        System.out.println("Enter Any String ");
		        String str1=sc.nextLine();
		        String rev="",word="";
		        int count=0;
		        str1=str1+" ";
		        System.out.println("Palindrome Words in Strings are : \n");
		        for(int a=0;a<
		str1.length();a++)
		        {
		            if(str1.charAt(a)==' ')
		            {
		                if(word.equals(rev))
		                {
		                    System.out.print(rev+" ");
		                    count++;
		                }    
		                rev="";
		                word="";
		            }
		            else
		            {
		                rev=str1.charAt(a)+rev;
		                word=word+str1.charAt(a);
		            }
		            
		        }
		        System.out.println("\nNumber of Palindrome Words : "+count);
		    }
}
