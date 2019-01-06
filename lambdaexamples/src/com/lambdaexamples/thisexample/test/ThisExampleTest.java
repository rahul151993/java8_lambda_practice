package com.lambdaexamples.thisexample.test;

import static org.junit.Assert.*;

import java.util.function.Consumer;

import org.junit.Test;

public class ThisExampleTest {

	@Test
	public void test_01_assertTrue() {
		assertTrue(true);
	}
	
	@Test
	public void test_02_ThisExampleNotNull()
	{
		ThisExample thisExample = new ThisExample();
		assertNotNull(thisExample);
	}
	
	@Test
	public void test_03_ThisExampleCase1()
	{
		ThisExample thisExample = new ThisExample();
		System.out.println("Calling class instance = "+thisExample);
		
		thisExample.process(10, new Consumer<Integer>(
				) {
			
			@Override
			public void accept(Integer t) {
				System.out.println("Anonymous class instance = "+this);
			}
		});
		
		thisExample.process(20, a -> System.out.println("Lambda Expression instance not modifies this reference = "+this));
		System.out.println("Current test case contains reference is  = "+this);
	}
	
	public String toString()
	{
		return "ThisExampleTest class reference";
	}

}
