/**
 * 
 */
package com.ian.strategy.pressing;

/**
 * @author Ian
 *
 */
public class AgressivePressing implements Pressing {

	/**
	 * 
	 */
	public AgressivePressing() {
		
	}

	/* (non-Javadoc)
	 * @see com.ian.strategy.Movement#move()
	 */
	@Override
	public int pressCommand() {
		
		return 1;
		
	}

}
