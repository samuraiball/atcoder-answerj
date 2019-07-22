package asynchronous.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		RunnableTask task1 = new RunnableTask("task1");
		RunnableTask task2 = new RunnableTask("task2");
		RunnableTask task3 = new RunnableTask("task3");

		executorService.submit(task1);
		executorService.submit(task2);
		// task 1 or 2が終了してから実行される。
		executorService.submit(task3);

		executorService.shutdown();
	}
}
