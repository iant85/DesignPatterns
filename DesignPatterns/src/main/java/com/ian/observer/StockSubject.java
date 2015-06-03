/**
 * 
 */
package com.ian.observer;

import java.util.ArrayList;

/**
 * @author Ian
 *
 */
public class StockSubject implements Subject {

	private ArrayList<Observer> observers;

	private double price;

	/**
	 * 
	 */
	public StockSubject() {

		observers = new ArrayList<Observer>();

	}
	
	@Override
	public void registerObserver(Observer observer) {

		observers.add(observer);

	}
	
	@Override
	public void unregisterObserver(Observer observer) {

		observers.remove(observers.indexOf(observer));

	}
	
	@Override
	public void notifyObserver() {

		for (Observer o : observers) {

			o.update();

		}

	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public void updatePrice(double price) {

		this.price += price;

		notifyObserver();

	}

}
