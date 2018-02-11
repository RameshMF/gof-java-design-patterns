package com.ramesh.gof.prototype.example1;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep original = new Sheep("Jolly");
		System.out.println(original.getName()); // Jolly

		// Clone and modify what is required
		Sheep cloned = original.clone();
		cloned.setName("Dolly");
		System.out.println(cloned.getName()); // Dolly
	}
}
