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
	 * 
	 */
	public ConcreteObserver(ConcreteSubject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void update(Double data) {
		// TODO Auto-generated method stub
		
	}

}
