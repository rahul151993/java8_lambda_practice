package com.behaviourpassingexamplebyJava7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.behaviourpassingexamplebyJava7.condition.service.ConditionForPrint;
import com.behaviourpassingexamplebyJava7.model.Person;

public class BehaviourPassingExampleByJava7 {
	
	public void printAll(List<Person> peoples)
	{
		for (Person person : peoples) {
			System.out.println(person);
		}
	}
	
	public void printWithCondition(List<Person> peoples, ConditionForPrint condition)
	{
		for (Person person : peoples) {
			if(condition.test(person))
			{
				System.out.println(person);
			}
		}
	}

	public List<Person> printSorted(List<Person> peoples, Comparator<Person> comparator) {
		Collections.sort(peoples, comparator);
		return peoples;
	}
}
