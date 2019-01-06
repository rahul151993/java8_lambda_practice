package com.lambdaexample.stream.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import org.junit.Test;

public class LambdaForStreamExampleTest {
	
	private ArrayList<Integer> numList  = new ArrayList<>();
	
	private static int sum = 0;
	public ArrayList<Integer> setNumberList(ArrayList<Integer> numList1)
	{
		numList1.add(10);
		numList1.add(20);
		numList1.add(30);
		numList1.add(40);
		numList1.add(50);
		numList1.add(60);
		numList1.add(70);
		numList1.add(80);
		return numList1;
	}
	
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_CheckForNumListIsNotNull()
	{
		numList = setNumberList(numList);
		assertNotNull(numList);
		assertTrue(numList.size()>0);
	}
	
	public boolean returnStatus(int i)
	{
		if(i>=30)
			return true;
		else
			return false;
	}
	
	public boolean returnStatusForRemenderValue(int i)
	{
		if(i%20==0)
			return true;
		else
			return false;
	}
	
	public int processForEachValue(int no)
	{
		return no*5;
	}
	
	public int reducerFunction(int sum, int no)
	{
		sum=sum+no;
		return sum;
	}
	@Test 
	public void test_03_StreamCase1()
	{
		numList = setNumberList(numList);
		assertNotNull(numList);
		assertTrue(numList.size()>0);
		System.out.println("Printing all the Number ArrayList using method reference");
		numList.stream().forEach(System.out::println);
		
		System.out.println("printing only the numbers which is >= 30");
		LambdaForStreamExampleTest lambdaForStreamExampleTest = new LambdaForStreamExampleTest();
		numList.stream().filter(lambdaForStreamExampleTest::returnStatus).forEach(System.out::println);
		
		System.out.println("doubling each and every value from the stream by using map");
		numList.stream().map(i->i*2).forEach(System.out::println);
		
		System.out.println("getting only the numbers which is divisible by 20");
		numList.stream().filter(lambdaForStreamExampleTest::returnStatusForRemenderValue).forEach(System.out::println);
		
		System.out.println("The Map and Reduce implementation for the above list");
		System.out.println(numList.stream().map(lambdaForStreamExampleTest::processForEachValue).reduce(0, lambdaForStreamExampleTest::reducerFunction));
	}	
}
