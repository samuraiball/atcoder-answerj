package gof.pluginfactory;

public class BarPlugin implements Plugin {
	@Override
	public void doSomething() {
		System.out.println("BarPlugin");
	}
}
