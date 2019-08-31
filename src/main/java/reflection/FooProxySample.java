package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class FooProxySample {

	private Foo foo;
	private Object proxiedFoo;

	private FooProxySample(Foo foo) {
		this.foo = foo;
		proxiedFoo = Proxy.newProxyInstance(
				Foo.class.getClassLoader(),
				new Class[]{},
				new FooHandler());
	}


	private class FooHandler implements InvocationHandler{

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("before called" );
			Object o  = method.invoke(foo);
			System.out.println("after called" );
			return o;
		}
	}
}
