package asynchronous.executor;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	private String param;

	CallableTask(String param) {

		this.param = param;
	}

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task is done");
		return "finished" + param;
	}
}
