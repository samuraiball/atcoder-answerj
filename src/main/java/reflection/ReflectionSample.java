package reflection;

import java.lang.reflect.Method;

public class ReflectionSample {

	public static void main(String[] args) {

		Class<Foo> fooClazz1 = Foo.class;
		Foo foo = new Foo("taro");

		try {
			Method greetMethod = fooClazz1.getMethod("greet");
			greetMethod.invoke(foo);
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
	}
}

