package lambdaexamples;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.behaviourpassingexamplewithoutlambda.BehaviourPassingWithoutLambda;
import com.behaviourpassingexamplewithoutlambda.service.BehaviourPrint;

public class BehaviourPassingTest1 {
	
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_BehaviourPassingWithoutLambdaNotNull()
	{
		BehaviourPassingWithoutLambda behaviourPassingWithoutLambda = new BehaviourPassingWithoutLambda();
		assertNotNull(behaviourPassingWithoutLambda);
	}
	
	@Test
	public void test_03_CallingMethodrunBehaviourForPrintCase1()
	{
		BehaviourPassingWithoutLambda behaviourPassingWithoutLambda = new BehaviourPassingWithoutLambda();
		behaviourPassingWithoutLambda.runBehaviourForPrint(new BehaviourPrint() {
			
			@Override
			public void printBehaviour() {
				System.out.println("This is passing Behaviour Example with the Normal Anonymous implementation class ");
			}
		});
		
		behaviourPassingWithoutLambda.runBehaviourForPrint(new BehaviourPrint() {
			
			@Override
			public void printBehaviour() {
				System.out.println("another 1 assign Behaviour Example with the Normal Anonymous implementation class ");
			}
		});
		
		behaviourPassingWithoutLambda.runBehaviourForPrint(new BehaviourPrint() {
			
			@Override
			public void printBehaviour() {
				System.out.println("another 2 assign Behaviour Example with the Normal Anonymous implementation class ");
			}
		});
	}
	
	@Test
	public void test_04_CallingMethodrunBehaviourForPrintCase2()
	{
		BehaviourPassingWithoutLambda behaviourPassingWithoutLambda = new BehaviourPassingWithoutLambda();
		behaviourPassingWithoutLambda.runBehaviourForPrint(()->System.out.println("This is passing Behaviour Example with Lambda Expression "));
		behaviourPassingWithoutLambda.runBehaviourForPrint(()->System.out.println("Lambda Example another 1"));
		behaviourPassingWithoutLambda.runBehaviourForPrint(()->System.out.println("Lambda Example another 2"));
	}
}
