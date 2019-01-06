package com.datechecking.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.datechecking.service.date.DateService;

public class DateTest {
	DateService dateService = null;
	
	@Before
	public void startExecution() {
		System.out.println("before started");
		dateService=new DateService();
	}
	@After
	public void endExecution() {
		System.out.println("after end");
		dateService=null;
	}
	
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void testForNotNull() {
		assertNotNull(dateService);
	}
	
	@Test
	public void testForDayCount() {
		MatcherAssert.assertThat(dateService.getTotalDays("01-01-2018"), is(equalTo(1)));
	}
	
	@Test
	public void testForDayCountForSameYear()
	{
		MatcherAssert.assertThat(dateService.getTotalDays("31-03-2020"), is(equalTo(821)));
	}
	
	@Test
	public void testForDayCountForSameYearWithDifferentMonth()
	{
		MatcherAssert.assertThat(dateService.getTotalDays("05-11-2018"), is(equalTo(309)));
	}
	
	@Test
	public void testForDayCountForDifferentYear()
	{
		MatcherAssert.assertThat(dateService.getTotalDays("05-11-2019"), is(equalTo(674)));
	}
	
	@Test
	public void testForDayCountForDifferentYearWithLeapYear()
	{
		MatcherAssert.assertThat(dateService.getTotalDays("05-11-2020"), is(equalTo(1040)));
	}
	
	@Test
	public void testForDayCountForDifferentYearWithInvalidDate()
	{
		MatcherAssert.assertThat(dateService.getTotalDays("31-02-2020"), is(equalTo(0)));
	}
	
}