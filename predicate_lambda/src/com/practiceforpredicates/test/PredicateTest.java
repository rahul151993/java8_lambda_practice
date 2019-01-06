package com.practiceforpredicates.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

import java.util.function.Predicate;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

@FixMethodOrder
public class PredicateTest {
	
	@Test
	public void test_01_assertTrue() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test_02_ConditionWithPredicates(){
		
		int[] numbers= {10,12,20,23,26,30,36,40}; 
		
		Predicate<Integer> p1=i->i%2==0;
		assertNotNull(p1);
		
		System.out.println("The test_02_ start here");
		for(int number : numbers) {
			if(p1.test(number))System.out.println(number);
		}
	}
	
	@Test
	public void test_03_ConditionWithPredicatesForStringOperation(){
		
		String[] str = {"delta","charlie","john","joseph","skala","michelin"};
		
		Predicate<String> p2=s->s.length()>5;
		assertNotNull(p2);
		
		System.out.println("The test_03_ start here");
		for(String st: str){
			if(p2.test(st))System.out.println(st);
		}
	}
	@Test
	public void test_04_PredicateJoinOperations() {
		
		int numbers[]= {10,5,12,14,16,18,20,22,24,26,28,30};
		
		Predicate<Integer> p3=i->i%2==0;
		Predicate<Integer> p4=i->i>20;

		assertNotNull(p3);
		assertNotNull(p4);
		
		System.out.println("The test_04_ start here");
		for(int nmbr: numbers) {
			
			//if(p3.and(p4).test(nmbr))System.out.println(nmbr);
			//if(p3.or(p4).test(nmbr))System.out.println(nmbr);
			if(p3.negate().test(nmbr))System.out.println(nmbr);
		}
 	}
	
	@Test
	public void test_05_PredicateWithReverseNumber() {
		int number=323,reminder,rev=0;
		int no=number;
		
		Predicate<Integer> p5=i->i>0;
		while(p5.test(no)) {
			reminder = no%10;
			rev=rev*10+reminder;
			no=no/10;
		}
		System.out.println("The original Number is = "+number+" and the reverse no is = "+rev);
		MatcherAssert.assertThat(rev,is(equalTo(323)));
		
		Predicate<Integer> p6=i->i==number;
		
		if(p6.test(rev))System.out.println("input numbers are palindrom");
		else System.out.println("No palindrom condition is satified that's why not palindrom");
	}
}
