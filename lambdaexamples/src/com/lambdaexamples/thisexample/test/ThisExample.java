package com.lambdaexamples.thisexample.test;

import java.util.function.Consumer;

public class ThisExample {
	
	public void process(int no, Consumer<Integer> consumer)
	{
		consumer.accept(no);
	}
	
	public String toString()
	{
		return "ThisExample Class Instance";
	}

}
