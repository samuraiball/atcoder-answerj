package designpattern.pluginfactory;

public class Main {
	public static void main(String[] args) {
		PluginFactory pluginFactory = PluginFactory.getInstance();


		Plugin barPlugin = null;
		Plugin fooPlugin = null;
		try {
			barPlugin = pluginFactory.getPlugin("bar");
			fooPlugin = pluginFactory.getPlugin("foo");
		} catch (Exception e) {
			e.printStackTrace();
		}

		fooPlugin.doSomething();
		barPlugin.doSomething();
	}
}
