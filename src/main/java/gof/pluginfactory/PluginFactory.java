package gof.pluginfactory;

import java.util.HashMap;
import java.util.Map;

public class PluginFactory {

	private static PluginFactory instance = new PluginFactory();

	private Map<String, Plugin> pluginMap;

	private PluginFactory() {
	}

	public Plugin getPlugin(String pluginName) throws Exception {
		synchronized (this) {
			if (pluginMap == null) {
				pluginMap = new HashMap<String, Plugin>();

				Class<?> clazz1 = Class.forName("gof.pluginfactory.FooPlugin");
				Plugin fooPlugin = (Plugin) clazz1.newInstance();
				pluginMap.put("foo", fooPlugin);

				Class<?> clazz2 = Class.forName("gof.pluginfactory.BarPlugin");
				Plugin barPlugin = (Plugin) clazz2.newInstance();
				pluginMap.put("bar", barPlugin);
			}
		}
		return pluginMap.get(pluginName);
	}

	public static PluginFactory getInstance() {
		return instance;
	}
}
