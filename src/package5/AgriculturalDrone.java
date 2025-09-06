//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package5;

import package1.*;
import package4.*;

public class AgriculturalDrone extends UAV {
	
	@Override
	public AgriculturalDrone copy() {
		
		//method to create and return a new copy of current object instance
		return new AgriculturalDrone(this);
	}
	
	// attributes
	private String brand;
	private int carryCapacity;
	
	// default constructor
	public AgriculturalDrone() {}
	
	// parameterized constructor
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	// copy constructor
	public AgriculturalDrone(AgriculturalDrone ad1) {
		this.brand = ad1.brand;
		this.carryCapacity = ad1.carryCapacity;
	}
	
	// accessors and mutators
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	public int getCarryCapacity() {
		return carryCapacity;
	}
	
	// toString method
	@Override
	public String toString() {
		return "This Agricultural Drone weighs " +getWeight()+ ", has a price of $" +getPrice()+ ", is from the brand " +brand+ " and has a carrying capacity of " +carryCapacity;
	}
	
	// equals method
	@Override
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		AgriculturalDrone ad01 = (AgriculturalDrone) x01;
		return(this.getWeight() == ad01.getWeight() && this.getPrice() == ad01.getPrice() && this.brand.equals(ad01.brand) && this.carryCapacity == ad01.carryCapacity);
	}

}
