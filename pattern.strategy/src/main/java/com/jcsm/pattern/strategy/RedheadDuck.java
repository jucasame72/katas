package com.jcsm.pattern.strategy;

public class RedheadDuck extends Duck {
	String display = "I'm a Redhead Duck!";

	public void display() {
		System.out.print(display);
		
	}
	
	public String getDisplay() {
		return display;
	}
}
