package com.test.WebApp.Model;


public class Employee {

	private int empId;
	private String empName;
	private int empSalary;
	private String empDepartment;
	
	public Employee(int empId, String empName, int empSalary, String empDepartment){
		
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDepartment=empDepartment;
		
	}

	public Employee() {
		
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	
	
}
