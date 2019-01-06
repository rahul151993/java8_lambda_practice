package com.lamdaexamples.methodrefenceexample;

import java.util.function.Consumer;

public class MethodReferenceExample {
	
	public void process(int no, Consumer<Integer> consumer)
	{
		consumer.accept(no);
	}
	
	public void printNumber(int no)
	{
		System.out.println("The Passed Number is  = "+no);
	}

}
