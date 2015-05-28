/**
 * 
 */
package com.ian.strategy.pressing;

/**
 * @author Ian
 * 
 * Interface which focuses on the nature of a press.
 * Indicates how the pressing was made - its power/aggression for instance.
 *
 */
public interface Pressing {
	
	/**
	 * Method indicating the nature of the pressing.
	 * For instance, -1 would be less powerful than 0 
	 * while, 1 would indicate more powerful pressing.
	 * 
	 * @return an Integer value indicating the type/power of the pressing.
	 */
	public int pressCommand();

}
