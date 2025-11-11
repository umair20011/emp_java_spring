package com.test.WebApp.Controller;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.WebApp.Model.Employee;
import com.test.WebApp.Service.EmployeeService;

@RestController
public class EmployeeControlller {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/GET/employee/all")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
	@GetMapping("/GET/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@PostMapping("/POST/employee/createEmployee")
	public void createEmployee(@RequestBody Employee emp) {
		service.createEmployee(emp);
	}
	
	@DeleteMapping("/DELETE/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
	@PutMapping("/PUT/employee/update-salary")
	public void updateSalary(@RequestParam int id, @RequestParam int salary) {
		service.updateSalary(id,salary);
	}
	
	@GetMapping("/GET/employee/average-salary")
	public long getAverageSalary() {
		return service.getAverageSalary();
	}
	
}
