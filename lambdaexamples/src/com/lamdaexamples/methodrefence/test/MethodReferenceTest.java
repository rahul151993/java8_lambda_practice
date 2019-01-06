package com.lamdaexamples.methodrefence.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.function.Consumer;

import org.junit.Test;

import com.lamdaexamples.methodrefenceexample.MethodReferenceExample;

public class MethodReferenceTest {

	@Test
	public void test_01_assertTrue() {
		assertTrue(true);
	}
	
	@Test
	public void test_02_MethodReferenceExampleNotNull()
	{
		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
		assertNotNull(methodReferenceExample);
	}
	
	@Test
	public void test_03_MethodReferenceExampleCase1()
	{
		System.out.println("By the Anonymous Class Way");
		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
		methodReferenceExample.process(10, new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) 
			{
				methodReferenceExample.printNumber(t);
			}
		});
		
		System.out.println("By the Lambda Expression Way");
		methodReferenceExample.process(20, a -> methodReferenceExample.printNumber(a));
		
		System.out.println("By the MethodReference way which is alternative for the Lambda Expression example1");
		methodReferenceExample.process(30, methodReferenceExample::printNumber); // which is same as the a -> methodReferenceExample.printNumber(a)
		
		System.out.println("By the Traditional Lambda Expression example");
		methodReferenceExample.process(40, a -> System.out.println(a));
		
		System.out.println("By the MethodReference for system.out.println()");
		methodReferenceExample.process(50, System.out::println);
	}
}
