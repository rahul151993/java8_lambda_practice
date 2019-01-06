package com.usingexistingexample;

import java.util.function.BiConsumer;

public class UsingExistingInterfaceForLambdaExample {
	
	public void startProcessing(int[] numbers, int key, BiConsumer<Integer,Integer> operation)
	{
		for (int i : numbers) {
			operation.accept(i, key);
		}
	}

}
