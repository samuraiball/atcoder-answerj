package asynchronous.runnable;

public class Main {
	public static void main(String[] args) {
		Thread thread = new Thread(new RunnableTask("foo"));
		thread.start();
		System.out.println("start");
	}
}
