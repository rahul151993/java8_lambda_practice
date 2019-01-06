package com.practice.lambdaexample1;

public class Employee 
{
	private int empId;
	private int age;
	private String empName;
	private int salary;
	private String addressingCity;
	private int gender; //0 for girl and 1 is boy
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee(int empId, int age, String empName, int salary, String addressingCity, int gender) {
		super();
		this.empId = empId;
		this.age = age;
		this.empName = empName;
		this.salary = salary;
		this.addressingCity = addressingCity;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", empName=" + empName + ", salary=" + salary
				+ ", addressingCity=" + addressingCity + ", gender=" + gender + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddressingCity() {
		return addressingCity;
	}
	public void setAddressingCity(String addressingCity) {
		this.addressingCity = addressingCity;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

}
