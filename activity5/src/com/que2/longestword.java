//author:Darshana Thakare
//find the longest word in text file

package com.que2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class longestword 
{
	public static void main(String [ ] args) throws FileNotFoundException {
        new longestword().findLongestWords();
   }

public String findLongestWords() throws FileNotFoundException {

 String longest_word = "";
 String current;
 Scanner sc = new Scanner(new File("C:\\activity.txt"));


 while (sc.hasNext()) {
    current = sc.next();
     if (current.length() > longest_word.length()) {
       longest_word = current;
     }

 }
   System.out.println("\n"+longest_word+"\n");
      return longest_word;
      }
}

	

