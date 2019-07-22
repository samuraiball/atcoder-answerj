package asynchronous.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainFuture {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		RunnableTask task1 = new RunnableTask("task1");
		RunnableTask task2 = new RunnableTask("task2");
		RunnableTask task3 = new RunnableTask("task3");
		try {
			Future<?> future1 = executorService.submit(task1);
			Future<?> future2 = executorService.submit(task2);

			future1.get();
			future2.get();

			// task1 と 2を待ち合わせてから実行される。
			executorService.submit(task3);


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}
}
