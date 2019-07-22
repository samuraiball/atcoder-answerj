package asynchronous.executor;

public class RunnableTask implements  Runnable{

	private String param;

	public RunnableTask(String param){
		this.param = param;
	}

	@Override
	public void run() {
		System.out.println(param);
	}
}
