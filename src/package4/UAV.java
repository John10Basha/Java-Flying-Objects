//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package4;

import flying.Flyables;

public class UAV implements Flyables {
	
	@Override
	public UAV copy() {
		
		//method to create and return a new copy of current object instance
		return new UAV (this);
	}
	
	// attributes
	private double weight;
	private double price;
	
	// default constructor
	public UAV() {}
	
	// parameterized constructor
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	
	// copy constructor
	public UAV(UAV uav1) {
		this.weight = uav1.weight;
		this.price = uav1.price;
	}
	
	// accessors and mutators
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	// toString method
	public String toString() {
		return "This UAV weighs " +weight+ " and has a price of $" +price;
	}
	
	// equals method
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		UAV uav01 = (UAV) x01;
		return(this.weight == uav01.weight && this.price == uav01.price);
	}

}
