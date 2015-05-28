/**
 * 
 */
package com.ian.strategy.pressing;

/**
 * @author Ian
 *
 */
public class DefensivePressing implements Pressing {

	/**
	 * 
	 */
	public DefensivePressing() {
		
	}

	/* (non-Javadoc)
	 * @see com.ian.strategy.Movement#move()
	 */
	@Override
	public int pressCommand() {
		
		return -1;
		
	}

}
