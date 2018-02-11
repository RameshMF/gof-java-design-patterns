package com.ramesh.gof.bridge.secondexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sword implements Weapon {

	private final Enchantment enchantment;
	private static final Logger LOGGER = LoggerFactory.getLogger(Sword.class);
	public Sword(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

	@Override
	public void wield() {
		LOGGER.info("The sword is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		LOGGER.info("The sword is swinged.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		LOGGER.info("The sword is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}