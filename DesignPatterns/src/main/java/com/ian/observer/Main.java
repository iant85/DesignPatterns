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

		ConcreteSubject subject1 = new ConcreteSubject();

		new ConcreteObserver(subject1);
		
		subject1.updateData(4.67);

	}

}
