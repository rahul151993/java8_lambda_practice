package com.lambdawithsingleargument.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.behaviourpassingexamplebyJava7.model.Person;
import com.lambdawithsingleargument.LambdaWithSingleArgument;

public class LambdaWithSingleArgumentTest {

	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_LambdaWithSingleArgumentNotNull()
	{
		LambdaWithSingleArgument lambdaWithSingleArgument = new LambdaWithSingleArgument();
		assertNotNull(lambdaWithSingleArgument);
	}
	
	@Test
	public void test_03_LambdaWithSingleArgumentCase1()
	{
		LambdaWithSingleArgument lambdaWithSingleArgument = new LambdaWithSingleArgument();
		Person p= new Person("firstname1", "lastname1", 28);
		lambdaWithSingleArgument.testForPersonData(p, p1 -> {
			if(p.getFirstName().isEmpty()&& p.getLastName().isEmpty()&&p.getAge()==0)
			{
				return false;
			}
			else
				return true;
		});
		Person p1= new Person("", "", 0);
		lambdaWithSingleArgument.testForPersonData(p1, p2 -> {
			if(p1.getFirstName().isEmpty()&& p1.getLastName().isEmpty()&&p1.getAge()==0)
			{
				return false;
			}
			else
				return true;
		});
	}
}
