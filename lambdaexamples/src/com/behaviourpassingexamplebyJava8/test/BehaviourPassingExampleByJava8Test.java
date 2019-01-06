package com.behaviourpassingexamplebyJava8.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.behaviourpassingexamplebyJava7.BehaviourPassingExampleByJava7;
import com.behaviourpassingexamplebyJava7.condition.service.ConditionForPrint;
import com.behaviourpassingexamplebyJava7.model.Person;

public class BehaviourPassingExampleByJava8Test {

	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_BehaviourPassingExampleByJava7NotNull()
	{
		BehaviourPassingExampleByJava7 behaviourPassingExampleByJava7 = new BehaviourPassingExampleByJava7();
		assertNotNull(behaviourPassingExampleByJava7);
	}
	
	@Test
	public void test_03_BehaviourPassingExampleByJava7Case1PrintAll()
	{
		System.out.println("The all data is as following");
		List<Person> peoples = Arrays.asList(new Person("sample1", "test1", 17), new Person("sample2", "test2", 24), new Person("sample3", "test3", 29),new Person("cample4", "cest4", 15));
		BehaviourPassingExampleByJava7 behaviourPassingExampleByJava7 = new BehaviourPassingExampleByJava7();
		behaviourPassingExampleByJava7.printAll(peoples);
	}
	
	@Test
	public void test_04_BehaviourPassingExampleByJava7Case1PrintWhoseAnyNameStartsWithC()
	{
		System.out.println("The persons with last name starts from c");
		List<Person> peoples = Arrays.asList(new Person("sample1", "test1", 17), new Person("sample2", "test2", 24), new Person("sample3", "test3", 29),new Person("sample4", "cest4", 15), new Person("cample5", "test5", 52));
		BehaviourPassingExampleByJava7 behaviourPassingExampleByJava7 = new BehaviourPassingExampleByJava7();
		behaviourPassingExampleByJava7.printWithCondition(peoples, p -> p.getLastName().startsWith("c"));
		System.out.println("The persons with first name starts from c");
		behaviourPassingExampleByJava7.printWithCondition(peoples , p -> p.getFirstName().startsWith("c"));
	}
	
	@Test
	public void test_05_BehaviourPassingExampleByJava7Case2PrintSort()
	{
		System.out.println("The persons with sorting last name");
		List<Person> peoples = Arrays.asList(new Person("sample2", "test2", 17), new Person("sample1", "test1", 24), new Person("sample4", "test4", 29),new Person("sample3", "cest3", 15), new Person("cample5", "test5", 52));
		BehaviourPassingExampleByJava7 behaviourPassingExampleByJava7 = new BehaviourPassingExampleByJava7();
		List<Person> peoplesSorted = behaviourPassingExampleByJava7.printSorted(peoples, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		behaviourPassingExampleByJava7.printAll(peoplesSorted);
		System.out.println("The persons with sorting First name");
		List<Person> peoplesSorted1 = behaviourPassingExampleByJava7.printSorted(peoples, (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		behaviourPassingExampleByJava7.printAll(peoplesSorted1);
	}
}
