package com.usingexistingexample.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.usingexistingexample.UsingExistingInterfaceForLambdaExample;

public class UsingExistingInterfaceForLambdaExampleTest {

	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_UsingExistingInterfaceForLambdaExample()
	{
		UsingExistingInterfaceForLambdaExample usingExistingInterfaceForLambdaExample = new UsingExistingInterfaceForLambdaExample();
		assertNotNull(usingExistingInterfaceForLambdaExample);
	}
	
	@Test
	public void test_03_usingExistingInterfaceForLambdaExampleCase1()
	{
		UsingExistingInterfaceForLambdaExample usingExistingInterfaceForLambdaExample = new UsingExistingInterfaceForLambdaExample();
		assertNotNull(usingExistingInterfaceForLambdaExample);
		int numbers[]= {1,2,3,4};
		int key = 2;
		System.out.println("The additional operation");
		usingExistingInterfaceForLambdaExample.startProcessing(numbers, key, (i,k) -> System.out.println(i+k));
		System.out.println("The Subtractional operation");
		usingExistingInterfaceForLambdaExample.startProcessing(numbers, key, (i,k) -> System.out.println(i-k));
		System.out.println("The Multiplication operation");
		usingExistingInterfaceForLambdaExample.startProcessing(numbers, key, (i,k) -> System.out.println(i*k));
	}
	
	@Test
	public void test_04_usingExistingInterfaceForLambdaExampleCase2()
	{
		UsingExistingInterfaceForLambdaExample usingExistingInterfaceForLambdaExample = new UsingExistingInterfaceForLambdaExample();
		assertNotNull(usingExistingInterfaceForLambdaExample);
		int numbers[]= {1,2,3,4};
		int key = 2;
		usingExistingInterfaceForLambdaExample.startProcessing(numbers, key, (i,k) -> System.out.println(i/k));
	}
	
	@Test
	public void test_05_usingExistingInterfaceForLambdaExampleExceptionCase()
	{
		UsingExistingInterfaceForLambdaExample usingExistingInterfaceForLambdaExample = new UsingExistingInterfaceForLambdaExample();
		assertNotNull(usingExistingInterfaceForLambdaExample);
		int numbers[]= {1,2,3,4};
		int key = 0;
		usingExistingInterfaceForLambdaExample.startProcessing(numbers, key, (i,k) -> {
			try
			{
				System.out.println(i/k);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error Resolved");
				k=1;
				System.out.println(i/k);
			}
		});
	}
	
}
