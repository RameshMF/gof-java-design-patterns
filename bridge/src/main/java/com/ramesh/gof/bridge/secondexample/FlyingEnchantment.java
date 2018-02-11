package com.ramesh.gof.bridge.secondexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyingEnchantment implements Enchantment {
	private static final Logger LOGGER = LoggerFactory.getLogger(FlyingEnchantment.class);
	@Override
	public void onActivate() {
		LOGGER.info("The item begins to glow faintly.");
	}

	@Override
	public void apply() {
		LOGGER.info("The item flies and strikes the enemies finally returning to owner's hand.");
	}

	@Override
	public void onDeactivate() {
		LOGGER.info("The item's glow fades.");
	}
}
