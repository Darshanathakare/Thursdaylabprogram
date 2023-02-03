package com.emp.entity;

import com.emp.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {
       private long empId;
       private String name;
       private double salary;
       
       //Entity reference
       Address address;//HAS-A relationship
}