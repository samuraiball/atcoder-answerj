package gof.pluginfactory;

public class FooPlugin implements Plugin {
	@Override
	public void doSomething() {
		System.out.println("FooPlugin");
	}
}
