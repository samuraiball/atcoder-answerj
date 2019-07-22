package designpattern.pluginfactory;

public class FooPlugin implements Plugin {
	@Override
	public void doSomething() {
		System.out.println("FooPlugin");
	}
}
