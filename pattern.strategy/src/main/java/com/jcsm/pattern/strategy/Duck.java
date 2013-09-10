package com.jcsm.pattern.strategy;

public abstract class Duck {

	public String display;

	public Duck() {
		super();
	}

	public String getDisplay() {
		return display;
	}

	public void performQuack() {
		System.out.print("Quack!\n");
		
	}

	public void performSwim() {
		System.out.print("I'm swimming!\n");
		
	}
	
	public void performFly() {
		System.out.print("I'm flying!\n");
		
	}

	public void display() {
		System.out.print(display);
		
	}

}