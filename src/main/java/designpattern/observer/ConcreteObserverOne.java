package designpattern.observer;

public class ConcreteObserverOne implements Observer{
	@Override
	public void onEvent(String eventName) {
		System.out.println("Observer one called by" + eventName);
	}
}
