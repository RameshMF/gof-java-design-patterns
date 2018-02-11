package com.ramesh.gof.bridge.secondexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Composition over inheritance. The Bridge pattern can also be thought of as
 * two layers of abstraction. With Bridge, you can decouple an abstraction from
 * its implementation so that the two can vary independently.
 * <p>
 * In Bridge pattern both abstraction ({@link Weapon}) and implementation (
 * {@link Enchantment}) have their own class hierarchies. The interface of the
 * implementations can be changed without affecting the clients.
 * <p>
 * In this example we have two class hierarchies. One of weapons and another one
 * of enchantments. We can easily combine any weapon with any enchantment using
 * composition instead of creating deep class hierarchy.
 * 
 */
public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Program entry point
	 * 
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {
		LOGGER.info("The knight receives an enchanted sword.");
		Sword enchantedSword = new Sword(new SoulEatingEnchantment());
		enchantedSword.wield();
		enchantedSword.swing();
		enchantedSword.unwield();

		LOGGER.info("The valkyrie receives an enchanted hammer.");
		Hammer hammer = new Hammer(new FlyingEnchantment());
		hammer.wield();
		hammer.swing();
		hammer.unwield();
	}
}
