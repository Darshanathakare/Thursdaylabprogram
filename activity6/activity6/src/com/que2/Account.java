//Author:Darshana Thakare
//creating a account class where we can deposit and withdraw money using userdefined exception
	
package com.que2;

import java.util.Scanner;

public class Account {

	    double diposit, withdraw;
	 double balance=0;
	 public void Bankaccount(double balance)
	 {
	     this.balance=balance;
	 }
	  void deposit(double ammount)
	{
	       Scanner b=new Scanner(System.in);
	    System.out.println("diposit a amount");
	     ammount=b.nextInt();
	     balance +=ammount;
	}
	 void withdraw(double ammount)
	{
	       Scanner b=new Scanner(System.in);
	    System.out.println("withdraw a amount");
	     ammount=b.nextInt();
	     balance +=ammount;
	}

	  void display()
	  {
	      System.out.println(balance);
	  }
	public static void main(String[]args)
	{


	}}
