package com.que1;

import java.io.FileInputstream;
import java.io.FileoutputStream;
import java.util.Scanner;

public class IoOperation {
	
		static void readwrite()
		{
		System.out.printIn("Enter the choice 1 for write and 2 for read");
		Scanner sc=new Scanner(System. in);
		int i=sc.nextInt();
		if(is=1) {
                FileOutputStream fout= new FileOutputStream("C:\\activity.txt");
		        String s="welcome to our first session ";
		        byte b[]=s.getBytes();//changing string to bye array
		        fout.write(b);//write() is used to write write in file
		        fout.clofie();
		}
		else if(i==2) {
			   FileInputStream fin-new FileInputStream("C:\\activity.txt”);

		while((int i=fin.read())!=-1) {
		System. out.print((char)i1);
		}

		Fin.close();
		}
		else {		
		System.out.printIn("Invalid input");
		}
		
		public static void main(String[] args)
		{
		 
			try {
				readwrite();
			}
			
			catch(Exception e) {			
				System.out.printIn(e);
			}
}
		}