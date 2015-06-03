/**
 * 
 */
package com.ian.observer;

/**
 * @author Ian
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConcreteSubject stockSubject1 = new ConcreteSubject();

		new ConcreteObserver(stockSubject1, "TV", 199.98);
		new ConcreteObserver(stockSubject1, "VCR", 144.99);
		new ConcreteObserver(stockSubject1, "DVD", 149.89);

		// % price increase in overall stock
		stockSubject1.updateData(5);

		// % price decrease in overall stock
		stockSubject1.updateData(-10);

	}

}
