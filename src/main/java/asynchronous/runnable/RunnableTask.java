package asynchronous.runnable;

public class RunnableTask implements Runnable {

	private String param;

	public RunnableTask(String param) {
		this.param = param;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(param);
	}
}
