package com.ramesh.gof.state.secondexample;

public class TVStopState implements State {
	 @Override
	 public void doAction() {
	  System.out.println("TV is turned OFF");
	 }
	}
