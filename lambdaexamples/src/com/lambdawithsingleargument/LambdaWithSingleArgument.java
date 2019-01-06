package com.lambdawithsingleargument;

import com.behaviourpassingexamplebyJava7.model.Person;
import com.lambdawithsingleargument.service.TestInterface;

public class LambdaWithSingleArgument {
	public void testForPersonData(Person p,TestInterface testInterface)
	{
		if(testInterface.test(p))
		{
			System.out.println("The Data is valid");
		}
		else
			System.out.println("The Data is invalid");
	}

}
