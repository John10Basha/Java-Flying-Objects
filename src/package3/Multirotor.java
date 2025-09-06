//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package3;

import package1.*;
import package2.*;

public class Multirotor extends Helicopter {
	
	@Override
	public Multirotor copy() {
		
		//method to create and return a new copy of current object instance
		return new Multirotor(this);
	}
	
	// attributes
	private int numberOfRotors;
	
	// default constructor
	public Multirotor() {}
	
	// parameterized constructor
	public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
		super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
		this.numberOfRotors = numberOfRotors;
	}
	
	// copy constructor
	public Multirotor(Multirotor m1) {
		super(m1);
		this.numberOfRotors = m1.numberOfRotors;
	}
	
	// accessor and mutator
	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}
	
	public int getNumberOfRotors() {
		return numberOfRotors;
	}
	
	// toString method
	@Override
	public String toString() {
		return "This Multirotor is from the brand " +getBrand()+ ", has a price of $" +getPrice()+ ", has " +getHorsepower()+ " horsepower, has " +getNumberOfCylinders()+ " cylinders, was created in " +getCreationYear()+ ", and has " +numberOfRotors+ " rotors";
	}
	
	// equals method
	@Override
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		Multirotor m01 = (Multirotor) x01;
		return(this.getBrand().equals(m01.getBrand()) && this.getPrice() == m01.getPrice() && this.getHorsepower() == m01.getHorsepower() && this.getNumberOfCylinders() == m01.getNumberOfCylinders() && this.getCreationYear() == m01.getCreationYear() && this.getPassengerCapacity() == m01.getPassengerCapacity() && this.numberOfRotors == m01.numberOfRotors);
	}
	
	

}
