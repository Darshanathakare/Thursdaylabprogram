//Dasrshana Thakare
package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"vaibhav",20,30000); //taking values for employee1
		Employee e2=new Employee(2,"Rutwik",21,20000);//taking values for employee2
		Employee e3=new Employee(3,"Aniket",18,25000);//taking values for employee3
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);  //sorting arrayList by  salary
		for(Employee e:al)
		{
			System.out.println(e.Salary+" "+e.id+" "+e.name+" "+e.age);
		}

	}

}