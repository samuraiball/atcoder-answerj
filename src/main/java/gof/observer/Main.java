package gof.observer;

public class Main {
	public static void main(String[] args) {

		Subject subject = Subject.getInstance();
		subject.addObserver(new ConcreteObserverOne());
		subject.addObserver(new ConcreteObserverTwo());

		subject.notifyObserver();
	}
}
