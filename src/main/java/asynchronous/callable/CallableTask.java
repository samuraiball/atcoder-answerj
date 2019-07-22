package asynchronous.callable;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

	private Integer param;

	CallableTask(Integer param) {
		this.param = param;
	}

	@Override
	public Integer call() throws Exception {
		return 1 + param;
	}
}
