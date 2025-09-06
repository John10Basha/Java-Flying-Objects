//---------------------------------------------------------------
// Assignment 1
// Part: II
// Written by: John Basha ID40286668
//---------------------------------------------------------------

package package1;

import flying.Flyables;

public class Airplane implements Flyables {
	
	@Override
	public Airplane copy() {
		
		//method to create and return a new copy of current object instance
		return new Airplane(this);
	}
	
	// attributes
	private String brand;
	private double price;
	private int horsepower;
	
	// default constructor
	public Airplane() {}
	
	// parameterized constructor
	public Airplane(String brand, double price, int horsepower) {
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}
	
	// copy constructor
	public Airplane(Airplane a1) {
		this.brand = a1.brand;
		this.price = a1.price;
		this.horsepower = a1.horsepower;
	}
	
	// accessors and mutators
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	// toString method
	public String toString() {
		return "This Airplane is from the brand " +brand+ ", has a price of $" +price+ " and has " +horsepower+ " horsepower.";
	}
	
	// equals method
	public boolean equals(Object x01) {
		if(x01 == null || this.getClass() != x01.getClass()) 
		{
			return false;
		}
		Airplane a01 = (Airplane) x01;
		return (this.brand.equals(a01.brand) && this.price == a01.price && this.horsepower == a01.horsepower);
	}
	
	

}
