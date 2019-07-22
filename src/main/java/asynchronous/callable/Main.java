package asynchronous.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	ExecutorService executorService = Executors.newSingleThreadExecutor();

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		CallableTask task = new CallableTask(1);
		System.out.println("start");

		Future<Integer> future = executorService.submit(task);

		try {
			Integer result = future.get();
			System.out.println("result = " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		finally {
			executorService.shutdown();
			System.out.println("executor closed");
		}
	}
}
