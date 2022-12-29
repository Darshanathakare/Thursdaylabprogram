//Dasrshana Thakare
package com.question3;

import java.util.TreeSet;

public class Colors {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Red"); //adding element to first tree set
		ts.add("Green");
		ts.add("Black");
		ts.add("Pink");
		ts.add("Orange");
		//print original list
		System.out.println("Original tree set"+ts); //displaying first tree set
		
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("Blue"); //adding element to second tree set
		ts1.add("Yellow");
		ts1.add("Violet");
		ts1.add("Gold");
		System.out.println("second Tree set"+ts1); //displaying second tree set
		ts1.addAll(ts);
		System.out.println("adding two Tree set"+ts1);//adding two tree set
		
		java.util.Iterator<String> it=ts1.descendingIterator();
		System.out.println("Elements in reverse Order:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("compare "+ts1.equals(ts)); //comparing two tree set
		System.out.println("Head set "+ts1.headSet("Black",true)); //getting first element
		System.out.println("Tail set "+ts1.tailSet("Yellow",true)); //getting last element
		

	}

}