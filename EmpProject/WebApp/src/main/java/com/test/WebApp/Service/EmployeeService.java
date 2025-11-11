package com.test.WebApp.Service;

import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

import com.test.WebApp.Model.Employee;

@Service
public class EmployeeService {

	List<Employee> employees= new ArrayList<>( Arrays.asList(
	
	    new Employee(101, "Sarthak", 10, "Sales"),
	    new Employee(102, "Anshul", 20, "IT"),
	    new Employee(103, "Amaan", 30000, "IT")
    ));
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) {
		
		for(Employee e : employees) {
			if(e.getEmpId()==id) {
				return e;
			}
		}
		return new Employee(0,"NA",0,"NA");
	}
	
	public void createEmployee(Employee emp) {
		employees.add(emp);
	}

	public void deleteEmployee(int id) {
		
		for(Employee e : employees) {
			if(e.getEmpId()==id) {
				employees.remove(e);
				break;
			}
		}
		
	}

	public void updateSalary(int id, int salary) {
		
		for(Employee e : employees) {
			if(e.getEmpId()==id) {
				e.setEmpSalary(salary);
				break;
			}
		}
		
	}

	public long getAverageSalary() {
		
		long avg=0;
		for(Employee e : employees) {
			avg=avg+e.getEmpSalary();
		}
		return avg/employees.size();
	}

	public int getHighestSalary() {
		
		int hs=0;
		for(Employee e : employees) {
			if(e.getEmpSalary()>hs) {
				hs=e.getEmpSalary();
			}
		}
		return hs;
		
	}

	public List<Employee> employeesWithAboveAvg() {
		List<Employee> list=new ArrayList<>();
		long avg=getAverageSalary();
		for(Employee e : employees) {
			if(e.getEmpSalary()>avg) {
				list.add(e);
			}
		}
		return list;
	}
	
}
