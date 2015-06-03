/**
 * 
 */
package com.ian.observer;

/**
 * @author Ian
 *
 */
public class Stock implements Observer {

	private Subject subject;

	private String name;

	private double initialPrice;

	/**
	 * 
	 */
	public Stock(Subject subject, String name, double initialPrice) {

		this.subject = subject;

		this.name = name;

		this.initialPrice = initialPrice;

		this.subject.registerObserver(this);

	}

	/**
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the initialPrice
	 */
	public double getInitialPrice() {
		return initialPrice;
	}

	/**
	 * @param initialPrice
	 *            the initialPrice to set
	 */
	public void setInitialPrice(double initialPrice) {
		this.initialPrice = initialPrice;
	}

	@Override
	public void update() {

		double cp = Double.valueOf(((StockSubject) this.subject).getPrice());
		double sp = cp += this.getInitialPrice();

		System.out.println("stock=" + this.getName() + "\ninitialPrice="
				+ this.getInitialPrice() + "\ncurrentPrice=" + sp + "\n");

	}

}
