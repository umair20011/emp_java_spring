package com.test.WebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

import com.test.WebApp.Model.Employee;

@Service
public class EmployeeService {

	List<Employee> employees= Arrays.asList(
	
	    new Employee(101, "Sarthak", 10, "Sales"),
	    new Employee(102, "Anshul", 20, "IT"),
	    new Employee(103, "Amaan", 30000, "IT")
    );
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
}
