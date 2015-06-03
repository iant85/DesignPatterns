/**
 * 
 */
package com.ian.observer;

/**
 * A Subject is one who provides data/updates to a subscriber (Observer).
 * 
 * @author Ian
 *
 */
public interface Subject {

	/**
	 * Register a subscriber (Observer) with this provider (Subject). The
	 * subscriber (Observer) will receive updates from this provider (Subject).
	 * 
	 * @param observer
	 *            An Observer subscribing to receive updates from this provider
	 *            (Subject).
	 */
	void registerObserver(Observer observer);

	/**
	 * Unregister a subscriber from receiving updates from this provider
	 * (Subject). The subscriber (Observer) will no longer be informed of any
	 * updates provided by this Subject.
	 * 
	 * @param observer
	 *            An Observer who is ceasing to receive updates from this
	 *            provider (Subject).
	 */
	void unregisterObserver(Observer observer);

	/**
	 * Send a notifyAll action to each subscriber (Observer) who subscribe to
	 * updates from this provider (Subject) information each of a change of
	 * state. Each subscriber (Observer) state should be updated accordingly. <br>
	 * <b>Example: </b><br>
	 * <code>for (Observer o : observers) {o.update();} </code> <br>
	 * where the update method is defined by Observer, we call
	 * <code>update()</code> on each Observer subscribed to receive updates from
	 * their provider (Subject).
	 */
	void notifyEachObserver();

}
