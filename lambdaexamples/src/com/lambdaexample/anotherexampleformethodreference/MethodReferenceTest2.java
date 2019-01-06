package com.lambdaexample.anotherexampleformethodreference;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lambdaexample.anotherexampleformethodreference.main.MethodRefence;

public class MethodReferenceTest2 {
	
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_MethodRefenceTest2Case1(){
		
		MethodRefence methodRefence = new MethodRefence();
		/*methodRefence.acceptRequest("sample", (s) -> processString(s));*/
		System.out.println("from method reference way");
		MethodReferenceTest2 methodReferenceTest2 = new MethodReferenceTest2();
		methodRefence.acceptRequest("sample2", methodReferenceTest2::processString);
	}
	
	public void processString(String s)
	{
		System.out.println("The String Length is = "+s.length());
	}
	
	public void test()
	{
		System.out.println("sample test function");
	}

}
