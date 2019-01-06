package com.lambdaexceptionexample.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lambdaexceptionexample.LambdaExceptionExample;
import com.lambdaexceptionexample.numberprocessor.service.NumberProcessor;

public class LambdaExceptionExampleTest {

	@Test
	public void test_01_assertTrue() {
		assertTrue(true);
	}
	
	@Test
	public void test_02_LambdaExceptionExampleNotNull()
	{
		LambdaExceptionExample lambdaExceptionExample = new LambdaExceptionExample();
		assertNotNull(lambdaExceptionExample);
	}
	
	@Test
	public void test_03_LambdaExceptionExampleCase1()
	{
		LambdaExceptionExample lambdaExceptionExample = new LambdaExceptionExample();
		lambdaExceptionExample.processing(20, 10,LambdaExceptionExample.wrapperLambda((a,b) -> System.out.println(a/b)));
	}
	
	@Test
	public void test_03_LambdaExceptionExampleCase2()
	{
		LambdaExceptionExample lambdaExceptionExample = new LambdaExceptionExample();
		lambdaExceptionExample.processing(20, 0,LambdaExceptionExample.wrapperLambda((a,b) -> System.out.println(a/b)));
	}
}
