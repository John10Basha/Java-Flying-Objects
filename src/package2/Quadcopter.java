//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package2;

import package1.*;

public class Quadcopter extends Helicopter {
	
	@Override
	public Quadcopter copy() {
		
		//method to create and return a new copy of current object instance
		return new Quadcopter(this);
	}
	
	// attributes
	private int maxFlyingSpeed;
	
	// default constructors
	public Quadcopter() {}
	
	// parameterized constructor
	public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	// copy constructor
	public Quadcopter(Quadcopter q1) {
		super(q1);
		this.maxFlyingSpeed = q1.maxFlyingSpeed;
	}
	
	// accessor and mutator
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	
	// toString method
	@Override
	public String toString() {
		return "This Quadcopter is from the brand " +getBrand()+ ", has a price of $" +getPrice()+ ", has " +getHorsepower()+ " horsepower, has " +getNumberOfCylinders()+ " cylinders, was created in " +getCreationYear()+ ", has a passenger capacity of " +getPassengerCapacity()+ " and has a max flying speed of " +maxFlyingSpeed;
	}
	
	// equals method
	@Override
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		Quadcopter q01 = (Quadcopter) x01;
		return (this.getBrand().equals(q01.getBrand()) && this.getPrice() == q01.getPrice() && this.getHorsepower() == q01.getHorsepower() && this.getNumberOfCylinders() == q01.getNumberOfCylinders() && this.getCreationYear() == q01.getCreationYear() && this.getPassengerCapacity() == q01.getPassengerCapacity() && this.maxFlyingSpeed == q01.maxFlyingSpeed);
	}
	
	

}
