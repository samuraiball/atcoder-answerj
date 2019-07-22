package asynchronous.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainInvokeAll {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		CallableTask task1 = new CallableTask("task1");
		CallableTask task2 = new CallableTask("task2");
		CallableTask task3 = new CallableTask("task3");

		List<CallableTask> taskList = new ArrayList<>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);

		try {
			List<Future<String>> futureList = executorService.invokeAll(taskList);

			for (Future future : futureList) {
				System.out.println(future.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}
}
