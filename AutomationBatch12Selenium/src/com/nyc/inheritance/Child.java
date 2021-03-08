package com.nyc.inheritance;

public class Child extends Parente {
	
	public void car() {
		System.out.println("I have a BMW car");
	}
	
	public static void main(String[] args) {
		Parente obj = new Parente();
		Child obj1 = new Child();
		obj1.property();
		obj1.car();
		
		
		
		
		
	}
	
	
}
