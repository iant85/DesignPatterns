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

		StockSubject stockSubject1 = new StockSubject();

		new Stock(stockSubject1, "TV", 199.98);
		new Stock(stockSubject1, "VCR", 144.99);
		new Stock(stockSubject1, "DVD", 149.89);

		// % price increase in overall stock
		stockSubject1.updatePrice(5);

		// % price decrease in overall stock
		stockSubject1.updatePrice(-10);

	}

}
