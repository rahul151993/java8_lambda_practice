package com.lambdaexample.stream.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class LambdaExampleTest {
	
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_lambdaTest()
	{
		LambdaExample lambdaExample = new LambdaExample();
		MatcherAssert.assertThat(lambdaExample.getMessage(()->"Successful Lambda Call"),is(equalTo("Successful Lambda Call")));
		MatcherAssert.assertThat(new Message() {
			
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return null;
			}
		}.getInt(), is(equalTo(10)));
	}
	
	@Test
	public void test_03_testForCollectionsStream()
	{
		ArrayList<Integer> data = new ArrayList<>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		int sum = data.parallelStream().map(item->item+5).reduce((identity,item)->identity+item).get();
		MatcherAssert.assertThat(sum, is(equalTo(175)));
		System.out.println("The Parallel printing");
		data.parallelStream().forEach(System.out::println);
		System.out.println("The Sequential printing");
		data.stream().forEach(System.out::println);
	}
	
	@Test
	public void test_04_testForCollectionsStream2()
	{
		ArrayList<Integer> data = new ArrayList<>();
		data.add(15);
		data.add(30);
		data.add(45);
		data.add(60);
		MatcherAssert.assertThat(data.parallelStream().findFirst().get(), is(equalTo(15)));
		MatcherAssert.assertThat(data.parallelStream().count(), is(equalTo(4l)));
		MatcherAssert.assertThat(data.parallelStream().filter(no -> no%30==0).count(), is(equalTo(2l)));
		MatcherAssert.assertThat(data.parallelStream().map(no->(double)no).reduce((identity,no)->identity+no).get().getClass(), is(equalTo(Double.class)));
		MatcherAssert.assertThat(data.parallelStream().map(no->(double)no).reduce((identity,no)->identity+no).get(), is(equalTo(150.0)));
	}
}
