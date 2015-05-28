/**
 * 
 */
package com.ian.strategy;

/**
 * @author Ian
 *
 */
public class NormalPressing implements Pressing {

	/**
	 * 
	 */
	public NormalPressing() {
		
	}

	/* (non-Javadoc)
	 * @see com.ian.strategy.Movement#move()
	 */
	@Override
	public int pressCommand() {
		
		return 0;
		
	}

}
