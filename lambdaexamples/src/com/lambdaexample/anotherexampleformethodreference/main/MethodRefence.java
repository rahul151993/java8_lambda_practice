package com.lambdaexample.anotherexampleformethodreference.main;

import java.util.function.Consumer;

public class MethodRefence {
	
	public void acceptRequest(String str, Consumer<String> consumer)
	{
		consumer.accept(str);
		
	}
}
