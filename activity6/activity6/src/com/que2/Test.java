package com.que2;

import java.util.*;
import java.util.Scanner;

public class Test {
		
		    static void fun() throws IllegalAccessException 
		    { 
		        double balance = 0, damount, wamount;

		        Scanner dep=new Scanner(System.in);
		        System.out.println("Deposit an amount");
		        damount=dep.nextInt();
		        balance += damount;

		        Scanner wd=new Scanner(System.in);
		        System.out.println("Withdraw an amount");
		        wamount=wd.nextInt();
		        balance -= wamount;
}
}