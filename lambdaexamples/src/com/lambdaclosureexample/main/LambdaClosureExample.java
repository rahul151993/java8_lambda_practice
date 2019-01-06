package com.lambdaclosureexample.main;

import java.util.function.Consumer;

public class LambdaClosureExample {

	public void doProcess(int no, Consumer<Integer> consumer)
	{
		consumer.accept(no);
	}
	public static void main(String[] args) {
		int a=10;
		int b;
		int c=30;
		System.out.println("Using regular expression");
		LambdaClosureExample lambdaClosureExample = new LambdaClosureExample();
		lambdaClosureExample.doProcess(a, new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t+c);				
			}
		});
		
		System.out.println("Using lambda expression");
		b=45;
		lambdaClosureExample.doProcess(a, a1 -> System.out.println(a1+b+c));
		
	}

}
