package com.practice.lambdaexample1.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import com.practice.lambdaexample1.Employee;

public class LambdaExpressionUseTest {

	private ArrayList<Employee> employeeList = new ArrayList<>();
	
	public ArrayList<Employee> setEmployeeList(ArrayList<Employee> employeeList)
	{
		Employee employee1 = new Employee(10, 24, "employee1", 35000, "Mungashi", 1);
		Employee employee2 = new Employee(11, 26, "employee2", 55000, "Mumbai", 1);
		Employee employee3 = new Employee(12, 23, "employee3", 45000, "Kalyan", 0);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee1);
		return employeeList;
	}
	
	@Test
	public void test_01_assertTrue() {
		assertTrue(true);
	}
	
	public Employee getSumOfAllEmployeesSalary(Employee employee1, Employee employee2)
	{
			employee1.setSalary(employee1.getSalary()+employee2.getSalary());
			return employee1;
	}
	
	
	public int compareById(Employee e1 , Employee e2)
	{
		if(e1.getEmpId()<e2.getEmpId())
		{
			return -1;
		}
		else
			return 1;
	}
	@Test
	public void test_02_LambdaExpressionExample1NotNull()
	{
		//display list using stream
		employeeList = setEmployeeList(employeeList);
		//employeeList.stream().forEach(p->System.out.println(p));
		employeeList.stream().forEach(System.out::println);
		//using reduce operations
		Employee resultantEmployee = new Employee(0, 0, "sample", 0, "roam", 0);
		LambdaExpressionUseTest test1=new LambdaExpressionUseTest();
		MatcherAssert.assertThat(employeeList.stream().reduce(resultantEmployee,test1::getSumOfAllEmployeesSalary).getSalary(), is(equalTo(135000)));
		MatcherAssert.assertThat(employeeList.stream().reduce(resultantEmployee,test1::getSumOfAllEmployeesSalary).getEmpName(), is(equalTo("sample")));
		MatcherAssert.assertThat(employeeList.stream().reduce(resultantEmployee,test1::getSumOfAllEmployeesSalary).getAddressingCity(), is(equalTo("roam")));
		MatcherAssert.assertThat(employeeList.parallelStream().sorted(test1::compareById).findFirst().get().getEmpId(), is(equalTo(10)));
		employeeList.stream().map(p->p.getSalary()>40000).forEach(p->System.out.println(p));
		employeeList.stream().skip(01).forEach(System.out::println);
		MatcherAssert.assertThat(employeeList.parallelStream().count(), is(equalTo(3l)));
		MatcherAssert.assertThat(employeeList.parallelStream().limit(2).count(), is(equalTo(2l)));
		}
}
