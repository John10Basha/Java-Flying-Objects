//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

import package1.*;
import package2.*;
import package3.*;
import package4.*;
import package5.*;
import flying.Flyables;

public class AirVehicles {
	
	private static Flyables[] copyFlyingObjects(Flyables[] x){
		
		// initialize a copy array with the same length as the passed array
		Flyables[] copyArr = new Flyables[x.length];
		
		// iterating through the array using the copy method created in the Flyables interface
		for(int i = 0 ; i < x.length ; i++) 
			copyArr[i] = x[i].copy();
		
		// returning the array containing the copied objects
		return copyArr;
	}
	
	public static void main(String[] args) {
		
		// creating an array consisting of Flyables objects
		Flyables[] anArrFly = {
				new Airplane("SkyJet", 45000, 920),
				new UAV(3000, 1000),
				new MAV(150, 27000, "Y456Z", 50),
				new Quadcopter("AeroQuad", 600000, 850, 4, 2023, 4, 240),
				new UAV(500, 120),
				new Helicopter("Falcon", 95000, 420, 5, 2020, 9),
				new Multirotor("XtremeRotor", 25000, 260, 8, 2001, 5, 14),
				new AgriculturalDrone(600, 9500, "AgroTech", 3),
				new MAV(300, 15000, "Omega", 135),
				new Airplane("SkyJet", 45000, 920),
				new UAV(600, 9500),
				new MAV(275, 24000, "AlphaX", 80),
				new Quadcopter("SkyDancer", 850000, 390, 6, 2007, 6, 520),
				new UAV(750, 360),
				new Helicopter("Blackhawk", 87000, 460, 7, 1999, 12)
		};
		
		// use the copyFlyingObjects to copy the passed array
		Flyables[] myCopiedArr = AirVehicles.copyFlyingObjects(anArrFly);
		
		// Display information about each object in the copied array
		System.out.println("Displaying copied array information:");
		for(Flyables z : myCopiedArr) {
			System.out.println(z);
		}
		
		System.out.println();
		
		// Display information about each object in the original array
		System.out.println("Displaying original array information:");
		for(Flyables y :anArrFly) {
			System.out.println(y);
		}
		
		System.out.println();
		System.out.println("Thank you, you have reached the end of my program");
	}
}
