/**
 * 
 */
package com.ian.observer;

/**
 * <b>A Subscriber</b> <br>
 * Concrete implementation of the the Observer interface. A concrete observer
 * subscribes to updates from a provider (Subject).
 * 
 * @author Ian
 *
 */
public class ConcreteObserver implements Observer {

	private Double data;

	/**
	 * Each instance of a ConcreteObserver registers a subscription to a
	 * provider (Subject) to receive state updates.
	 */
	public ConcreteObserver(ConcreteSubject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void update(Double data) {
		this.data = data;
		display();

	}

	/**
	 * Display state changes made by the Subject (provider) to this subscriber
	 * (Observer).
	 */
	public void display() {
		System.out.println("current Observer state=" + data + "\n");

	}

}
