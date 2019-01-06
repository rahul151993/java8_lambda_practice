package com.lambdaexceptionexample;

import com.lambdaexceptionexample.numberprocessor.service.NumberProcessor;

public class LambdaExceptionExample {

	public void processing(int a, int b,NumberProcessor numberProcessor) {
		numberProcessor.process(a, b);
	}
	
	public static NumberProcessor wrapperLambda(NumberProcessor numberProcessor)
	{
		return (a,b) ->{
			try
			{
				numberProcessor.process(a, b);
			}
			catch(ArithmeticException e)
			{
				int b1=4;
				numberProcessor.process(a, b1);
			}
			
		};
	}
}

