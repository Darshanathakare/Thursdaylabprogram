//Dasrshana Thakare
package com.question1;

public class Employee implements Comparable<Employee> {
	int id;   //taking values
	String name;
	int age;
	int Salary;
	
	
   //creating constructor
	public Employee(int id,  String name,int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Salary = salary;
	}
	
    public int compareTo(Employee e)
    {
    	if(Salary==e.Salary) //comparing employees with salary
    		return 0;
    	else if(Salary<e.Salary)
    		return 1;
    	else return -1;
    	
    }
	

	




	
	

}