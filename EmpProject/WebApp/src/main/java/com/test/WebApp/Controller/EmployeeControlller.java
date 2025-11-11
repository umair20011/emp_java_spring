package com.test.WebApp.Controller;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.WebApp.Model.Employee;
import com.test.WebApp.Service.EmployeeService;

@RestController
public class EmployeeControlller {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee/all")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
}
