package com.lambdaexample.stream.test;

@FunctionalInterface
public interface Message {
	public String getMessage();
	default public int getInt()
	{
		return 10;
	}
}
