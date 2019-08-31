package reflection;

public class Foo {

	Foo(String name){
		this.name = name;
	}

	private String name;

	public void greet(){
		System.out.println("Hello, " + name);
	}
}

