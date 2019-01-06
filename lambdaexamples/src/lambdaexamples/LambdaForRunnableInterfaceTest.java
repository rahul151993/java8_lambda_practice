package lambdaexamples;

import static org.junit.Assert.*;

import org.junit.Test;

import lambdaexamples.runnableexample.LambdaForRunnable;

public class LambdaForRunnableInterfaceTest {

	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_LambdaForRunnableNotNull()
	{
		LambdaForRunnable lambdaForRunnable = new LambdaForRunnable();
		assertNotNull(lambdaForRunnable);
	}
	
	@Test
	public void test_03_CallingMethodStartThreadByPassingBehaviourCase1()
	{
		LambdaForRunnable lambdaForRunnable = new LambdaForRunnable();
		lambdaForRunnable.startThreadByPassingBehaviour(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The thread is run using the anonymous implementation class 1");
			}
		});
		
		lambdaForRunnable.startThreadByPassingBehaviour(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The thread is run using the anonymous implementation class 2");
				
			}
		});
	}
	
	@Test
	public void test_04_CallingMethodStartThreadByPassingBehaviourCase2()
	{
		LambdaForRunnable lambdaForRunnable = new LambdaForRunnable();
		lambdaForRunnable.startThreadByPassingBehaviour(()->System.out.println("The LambdaRunning Example"));
		lambdaForRunnable.startThreadByPassingBehaviour(()->{
			System.out.println("The another Example ");
			int var=5;
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*var);
			}
		});
	}
}
