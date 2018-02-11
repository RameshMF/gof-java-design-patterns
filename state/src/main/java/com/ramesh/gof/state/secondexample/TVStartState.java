package com.ramesh.gof.state.secondexample;

public class TVStartState implements State {
	 @Override
	 public void doAction() {
	  System.out.println("TV is turned ON");
	 }
	}