package com.ramesh.gof.stratergy;

public class OperationDevision implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return (num1/num2);
	   }
	}