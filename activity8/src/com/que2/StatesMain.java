package com.que2;

public class StatesMain {
	public static void main(String[] args) {
		States s=new States();
		s.addState("Maharashtra");
		s.addState("Karnataka");
		s.addState("Telangana");
		s.addState("Punjab");
		s.addState("Tamilnadu");
		
		System.out.println("retrieve the details of the state "+s.retrieveState("Maharashtra"));
		System.out.println("retrieve the details of the state "+s.retrieveState("Karnataka"));
	}

}
