package com.infyme.OverRidingDemo;

public class MethodOverrideDemo {

	public void calculateAmount(int amount) {
		System.out.println("the total amount");

	}

	public static void main(String args[]) {
		MethodOverrideDemo m = new DiamondCustomer();
		m.calculateAmount(20);
	}
}
