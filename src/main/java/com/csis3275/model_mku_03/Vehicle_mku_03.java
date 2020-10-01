package com.csis3275.model_mku_03;

// parent class with appropriate get and set methods for properties
public class Vehicle_mku_03 {
	public String powerSource;
	public int wheels;
	public String type;
	public String brand;
	public String year;

	public String getPowerSource() {
		if (type.equals("Car"))
			powerSource = "Gas";
		else
			powerSource = "Human";
		return powerSource;
	}	
	public int getWheels() {
		if (type.equals("Car"))
			wheels = 4;
		else
			wheels = 2;
		return wheels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	// child classes extending parent class with appropriate get and set methods for properties
	public class Car extends Vehicle_mku_03 {
		public String speed;
		public String safety;
		
		public String speed() {
			speed = "fast";
			return speed;
		}
		
		public String safety() {
			safety = "safe with seatbelts and airbags available (but depends on driver...)";
			return safety;
		}
	}
	
	public class Bike extends Vehicle_mku_03 {	
		public String speed;
		public String safety;
		
		public String speed() {
			speed = "moderate";
			return speed;
		}
		
		public String safety() {
			safety = "moderately safe (becareful of cars!)";
			return safety;
		}
	}
}
