package com.example.config;

public class Employee {

	
	private int employeeId;
	private String employeeName;
	private long salary;
	
	public Employee(int employeeId,String employeeName,long salary) {
		// TODO Auto-generated constructor stub
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", employeeName=" + employeeName + "]";
	}
	
	
}
