/**
 * 
 */
package com.ian.strategy;

/**
 * @author Ian
 * 
 * The defensive strategy of a team in game-play
 *
 */
public class Defending {
	
	/**
	 * 
	 */
	private Pressing pressingStrategy;

	/**
	 * 
	 */
	public Defending() {
		
	}

	/**
	 * @return the pressingStrategy
	 */
	public Pressing getPressing() {
		return pressingStrategy;
	}

	/**
	 * @param pressingStrategy the pressingStrategy to set
	 */
	public void setPressing(Pressing pressingStrategy) {
		this.pressingStrategy = pressingStrategy;
	}
	
	/**
	 * Indicates, to the defense, how they should press
	 */
	public void press() {
		
		pressingStrategy.pressCommand();
		
	}

}
