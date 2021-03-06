package com.day2.overriding;

public class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, 
			int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}
	
	public void display() {
		System.out.println("Make: "+ getMake());
		System.out.println("Model: "+ super.getModel());
		System.out.println("Doors: "+noOfDoor);
	}
}
