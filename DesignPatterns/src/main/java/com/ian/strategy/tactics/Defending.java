/**
 * 
 */
package com.ian.strategy.tactics;

import com.ian.strategy.pressing.Pressing;

/**
 * The defensive strategy of a team in game-play.
 * 
 * @author Ian
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
