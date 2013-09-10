package com.jcsm.pattern.strategy;

public class MallardDuck extends Duck {
	String display = "I'm a Mallard Duck!";
	
	public void display() {
		System.out.print(display);
		
	}
	
	public String getDisplay() {
		return display;
	}
	
}
