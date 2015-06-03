/**
 * 
 */
package com.ian.observer;

/**
 * An Observer is one who subscribes to updates from the Subject (provider).
 * 
 * @author Ian
 *
 */
public interface Observer {

	/**
	 * Update the state of the Observer in accordance with a notify event sent
	 * by a provider (Subject) to which this Observer is subscribed.
	 */
	void update(Double data);

}
