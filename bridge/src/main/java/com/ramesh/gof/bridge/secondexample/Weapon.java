package com.ramesh.gof.bridge.secondexample;

public interface Weapon {
	void wield();

	void swing();

	void unwield();

	Enchantment getEnchantment();
}
