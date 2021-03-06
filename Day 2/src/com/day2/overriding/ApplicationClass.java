package com.day2.overriding;

import java.util.Scanner;

public class ApplicationClass {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int wheelCount, passengerCount, model, doorCount;
		String make, isDoorOpen;

		System.out.println("Enter make: ");
		make = in.nextLine();
		System.out.print("Enter model: ");
		model = in.nextInt();
		System.out.println("Enter number of Wheels: ");
		wheelCount = in.nextInt();
		System.out.println("Enter Passenger Capacity: ");
		passengerCount = in.nextInt();
		System.out.println("Enter number of Doors: ");
		doorCount = in.nextInt();
		
		System.out.println("1. Create a Vehicle Object");
		System.out.println("2. Create a Car Object");
		System.out.println("3. Create a Convertible Object");
		System.out.println("4. Create a SportCar object");
		System.out.println("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			Vehicle vehicle = new Vehicle(wheelCount, passengerCount, model, make);
			vehicle.display();
			break;
		case 2:
			Car car = new Car(wheelCount, passengerCount, model, make, doorCount);
			car.display();
			break;
		case 3:
			System.out.println("Is door Open? [Yes/No]");
			isDoorOpen = in.nextLine();
			boolean hoodState;
			hoodState = isDoorOpen.equalsIgnoreCase("yes") ? true : false;
			Convertible conv = new Convertible(wheelCount, passengerCount, model, make, doorCount, hoodState);
			conv.display();
			break;
		case 4: 
			SportsCar sports = new SportsCar(wheelCount,passengerCount,model,make);
			sports.display();
			break;
		default: System.out.println("Invalid Choice");
		}
	}
}
