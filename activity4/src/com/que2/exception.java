//author:darshana thakare
 

package com.que2;

public class exception {


			 static void checkEligibilty(int age, int weight){
			 if(age<18 && weight<50) {
			 throw new ArithmeticException("Invalid Age Weight Exception");
			 }
			 else {
			 System.out.println("Valid Age Weight Exception!!");
			 }
			 }
			 public static void main(String args[]){
			 System.out.println("YOU HAVE SUCESSFULLY COMPLETED ");
			 checkEligibilty(18, 50);
			 
			}
			}
	

