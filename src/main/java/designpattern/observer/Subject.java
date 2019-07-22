package designpattern.observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {

	private static Subject instance = new Subject();

	private List<Observer> observers = new ArrayList<>();

	private Subject(){
	}

	public static Subject getInstance() {
		return instance;
	}

	public synchronized void addObserver(Observer observer){
		observers.add(observer);
	}

	public synchronized void notifyObserver(){
		observers.stream().forEach(o -> o.onEvent("Subject"));
	}
}
