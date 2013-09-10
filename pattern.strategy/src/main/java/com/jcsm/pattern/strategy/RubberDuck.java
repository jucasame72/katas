package com.jcsm.pattern.strategy;

public class RubberDuck extends Duck {
	String display = "I'm a Rubber Duck!";
	
	public void display() {
		System.out.print(display);
		
	}
	
	public String getDisplay() {
		return display;
	}
	
	public void performFly(){
		System.out.print("I can't fly!\n");
	}
}
