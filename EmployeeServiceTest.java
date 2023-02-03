package com.emp.servicetest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.emp.entity.Address;
import com.emp.entity.Employee;
import com.emp.exception.GlobalException;
import com.emp.service.EmployeeService;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.emp.Excepection.GlobalExcepection;
import com.emp.entity.Address;
import com.emp.service.EmployeeService;

@TestMethodOrder(value =  OrderAnnotation.class)
public class EmployeeServiceTest {

	static EmployeeService employeeService;
	static List<EmployeeService> emplist;
	
	@BeforeEach
	void setUp() throws Exception{
		employeeService =new EmployeeService();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		employeeService =null;
		System.out.println("object is garbage collected");
	}
	
	@Test
	@Order(1)
	@DisplayName("Testing add employee method")
	void testAddEmployee() throws GlobalExcepection
	{
		//way 1
//		employeeService.addEmployee(123, "Pratik", 25000, "Pune"," India" );
//		employeeService.addEmployee(199, "Vaibhav", 30000, "pune"," India" );
//		assertEquals(2,employeeService.lenghtOfList());
		
		//way 2
		Address add= Address.builder().city("Pune").country("India").build();
		Employee emp=Employee.builder().empId(123).name("Vaibhav").salary(25000).address(add).build();
		employeeService.addEmp(emp);
		EmployeeService e=employeeService.displayEmpById(123);
		//assertEquals("Vaibhav",e.getName());
		 assertThat(e.getSalary()).isEqualByComparingTo(25000.00);
	}
	
	@Test
	@Order(3)
	@DisplayName("Testing display employee by Id")
	void testDisplayById() throws GlobalExcepection{
		Address add= Address.builder().city("Pune").country("India").build();
		EmployeeService emp=EmployeeService.builder().empId(123).name("Vaibhav").salary(25000).address(add).build();
		employeeService.addEmp(emp);
		EmployeeService e=employeeService.displayEmpById(123);
		//assertEquals("Vaibhav",e.getName());
		assertThat(e.getSalary()).isEqualByComparingTo(25000.00);
	}
	
	@Test
	@Order(2)
	@DisplayName("Testing update emplyee")
	void testUpdateEmployee()
	{
		Address add= Address.builder().city("Pune").country("India").build();
		Employee emp= Employee.builder().empId(123).name("Vaibhav").salary(25000).address(add).build();
		employeeService.addEmp(emp);
		Employee e=employeeService.findId(123);
		e.setName("Dnyandev");
		
		employeeService.updateEmp(0, e);
		//employeeService.displayAllEmployee();
		//assertEquals("Dnyandev",e.getName());
		assertThat(e.getName()).isEqualTo("Dnyandev");
	}
	
	@Test
	@Order(4)
	@DisplayName("Removing the Employee by Id")
	void testRemoveById()
	{
		Address add= Address.builder().city("Pune").country("India").build();
		Employee emp= Employee.builder().empId(123).name("Vaibhav").salary(25000).address(add).build();
		employeeService.addEmp(emp);
		employeeService.displayAllEmployee();
		System.out.println("Id is Removed");
		employeeService.RemoveId(123);
		//assertEquals("Vaibhav",employeeService.findId(123).getName());
		assertThat(employeeService.findId(123));
		employeeService.displayAllEmployee();
		
		
	}
	
	@Test
	@Order(5)
	@DisplayName("Deleting all the employee details")
	void testDeleteAllDetails()
	{
		assertEquals("All employee details deleted successfully!!",
		employeeService.RemoveAllemployee());
		
	}
	
	@Test
	@Order(6)
	void testCalculateYearlySalary()
	{
		Address add= Address.builder().city("Pune").country("India").build();
		Employee emp= Employee.builder().empId(123).name("Vaibhav").salary(25000).address(add).build();
		employeeService.addEmp(emp);
		double sal=employeeService.calculateYearlySalary(123);
		assertEquals(300000,sal);
	}
	
	@Test
	@Order(7)
	void testCalculateAppraisal()
	{
		Address add= Address.builder().city("Pune").country("India").build();
		Employee emp= Employee.builder().empId(123).name("Vaibhav").salary(35000).address(add).build();
		employeeService.addEmp(emp);
		double appraisal=employeeService.calculateAppraisal(123);
		assertEquals(2500,appraisal);
		
		
	}
	
}
