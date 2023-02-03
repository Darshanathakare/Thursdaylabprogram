package com.emp.service;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

import com.emp.Excepection.GlobalExcepection;
import com.emp.entity.Address;


import java.util.ArrayList;

public  class EmployeeService  {
      private static List<EmployeeService> employee = new ArrayList<EmployeeService>();
      Scanner sc = new Scanner(System.in);
      
 // method to add employee details in array list
public  void addEmployeeService(long empid, String name, double salary,String city, String country)
{
	
	Address address = new Address(city,country);
	List<EmployeeService> employeeservice;
	//employee.add(new EmployeeService(emp Id, name, salary, address));//
}
//for testing using builder annotation
public void addEmp(EmployeeService emp)
{
	employee.add(emp);
}
//method to display all employee details
public EmployeeService displayEmpById(int id) throws GlobalExcepection
{
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			return employee.get(i);
		}
		else
		{
			throw new GlobalExcepection("Employee ID not found!!");
		}
	}
	return null;
}
private int getEmpId() {
	// TODO Auto-generated method stub
	return 0;
}
//update Employee
public EmployeeService updateEmp(int index, EmployeeService emp)
{
	return employee.set(index, emp);
}
public EmployeeService findId(int id)
{
	EmployeeService emp =null;
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			emp= employee.get(i);
		}
	}
	return emp;
}
public int lengthOfList()
{
	return employee.size();
}
public IntPredicate getSalary() {
	// TODO Auto-generated method stub
	return null;
}
public static Object builder() {
	// TODO Auto-generated method stub
	return null;
}
public void setName(String string) {
	// TODO Auto-generated method stub
	
}
public Object getName() {
	// TODO Auto-generated method stub
	return null;
}
//delete Employee
public EmployeeService deleteEmp(int index, EmployeeService emp)
{
	return employee.set(index, emp);
}
public Object deleteAllEmployee() {
	// TODO Auto-generated method stub
	return null;
}
public double calculateYearlySalary(int i) {
	// TODO Auto-generated method stub
	return 0;
}
public void displayAllEmployee() {
	// TODO Auto-generated method stub
	
}

	
}