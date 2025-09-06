//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package2;

import package1.*;

public class Helicopter extends Airplane {
	
	@Override
	public Helicopter copy() {
		
		//method to create and return a new copy of current object instance
		return new Helicopter(this);
	}
	
	// attributes
	private int numberOfCylinders;
	private int creationYear;
	private int passengerCapacity;
	
	// default constructors
	public Helicopter() {}
	
	// parameterized constructor
	public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
		super(brand, price, horsepower);
		this.numberOfCylinders = numberOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
	
	// copy constructor
	public Helicopter(Helicopter h1) {
		super(h1);
		this.numberOfCylinders = h1.numberOfCylinders;
		this.creationYear = h1.creationYear;
		this.passengerCapacity = h1.passengerCapacity;
	}
	
	// accessors and mutators
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
	
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	
	public int getCreationYear() {
		return creationYear;
	}
	
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	
	// toString method
	@Override
	public String toString() {
		return "This Helicopter is from the brand " +getBrand()+ ", has a price of $" +getPrice()+ ", has " +getHorsepower()+ " horsepower, has " +numberOfCylinders+ " cylinders, was created in " +creationYear+ ", and has a passenger capacity of " +passengerCapacity;
	}
	
	// equals method
	@Override
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass())
		{
			return false;
		}
		Helicopter h01 = (Helicopter) x01;
		return(this.getBrand().equals(h01.getBrand()) && this.getPrice() == h01.getPrice() && this.getHorsepower() == h01.getHorsepower() && this.numberOfCylinders == h01.numberOfCylinders && this.creationYear == h01.creationYear && this.passengerCapacity == h01.passengerCapacity);
	}
	

}
