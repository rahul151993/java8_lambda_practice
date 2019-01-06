package lambdaexamples.runnableexample;

public class LambdaForRunnable {
	
	public void startThreadByPassingBehaviour(Runnable runnable)
	{
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
