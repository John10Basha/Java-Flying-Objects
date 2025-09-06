//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package5;

import package4.*;

public class MAV extends UAV {
	
	@Override
	public MAV copy() {
		
		//method to create and return a new copy of current object instance
		return new MAV(this);
	}
	
	// attributes
	private String model;
	private double size;
	
	// default constructor
	public MAV() {}
	
	// parameterized constructor
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	// copy constructor
	public MAV(MAV mav1) {
		super(mav1);
		this.model = mav1.model;
		this.size = mav1.size;
	}
	
	//accessor and mutators
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public double getSize() {
		return size;
	}
	
	// toString method
	@Override
	public String toString() {
		return "This MAV weighs " +getWeight()+ ", has a price of $" +getPrice()+ ", is a " +model+ " model, and has a size of " +size;
	}
	
	// equals method
	@Override
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		MAV mav01 = (MAV) x01;
		return(this.getWeight() == mav01.getWeight() && this.getPrice() == mav01.getPrice() &&this.model.equals(mav01.model) && this.size == mav01.size);
	}
	

}
