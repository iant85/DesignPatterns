/**
 * 
 */
package com.ian.strategy.main;

import com.ian.strategy.pressing.AgressivePressing;
import com.ian.strategy.pressing.DefensivePressing;
import com.ian.strategy.pressing.NormalPressing;
import com.ian.strategy.tactics.Defending;

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

		Defending d1 = new Defending();
		Defending d2 = new Defending();
		Defending d3 = new Defending();

		d1.setPressing(new AgressivePressing());
		d2.setPressing(new DefensivePressing());
		d3.setPressing(new NormalPressing());

		d1.press();
		d2.press();
		d3.press();

		System.out.println("Agressive Pressing: " + d1.getPressing().pressCommand());
		System.out.println("Defensive Pressing: " + d2.getPressing().pressCommand());
		System.out.println("Normal Pressing: " + d3.getPressing().pressCommand());

	}

}
