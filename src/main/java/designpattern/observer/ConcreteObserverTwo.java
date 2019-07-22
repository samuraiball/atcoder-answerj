package designpattern.observer;

public class ConcreteObserverTwo implements Observer {
	@Override
	public void onEvent(String eventName) {
		System.out.println("Observer two called by" + eventName);
	}
}
