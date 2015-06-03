/**
 * 
 */
package com.ian.observer;

import java.util.ArrayList;

/**
 * <b>The Provider</b> <br>
 * Concrete implementation of the Subject interface. This implementation is
 * primed to provide updates (state change) to any/all subscribers (Observer) to
 * this provider (Subject).
 * 
 * @author Ian
 *
 */
public class ConcreteSubject implements Subject {

	// list of subscribers (Observer) who are to receive updates from this
	// provider (Subject)
	private ArrayList<Observer> observers;

	// the data each subscriber wishes to be informed of in event of data state
	// changes
	private Double data;

	/**
	 * 
	 */
	public ConcreteSubject() {
		observers = new ArrayList<Observer>();

	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void unregisterObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0)
			observers.remove(i);

	}

	@Override
	public void notifyEachObserver() {
		for (Observer o : observers) {
			o.update(data);
		}

	}

	/**
	 * The state of a subscriber (Observer) is changed and updated. This is the
	 * data that this provider (Subject) offers each subscriber (Observer).
	 * 
	 * @param data
	 *            The data that each subscriber (Observer) seeks to be updated
	 *            with.
	 */
	public void updateData(Double data) {
		this.data = data;
		notifyEachObserver();

	}

	/**
	 * @return the observers
	 */
	public ArrayList<Observer> getObservers() {
		return observers;
	}

	/**
	 * @param observers
	 *            the observers to set
	 */
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	/**
	 * @return the data
	 */
	public Double getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Double data) {
		this.data = data;
	}

}
