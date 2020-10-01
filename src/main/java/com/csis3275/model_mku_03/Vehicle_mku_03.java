package com.csis3275.model_mku_03;

// parent class with appropriate get and set methods for properties
public class Vehicle_mku_03 implements VehicleInterface_mku_03 {
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

	// overridden classes implemented in interface
	@Override
	public String sound() {
		String sound;
		if (type.equals("Car"))
			sound = "vroom vroom";
		else
			sound = "beep beep";
		return sound;
	}

	@Override
	public String seats() {
		String seats;
		if (type.equals("Car"))
			seats = "2+";
		else
			seats = "1";
		return seats;
	}

	// child classes extending parent class and implementing interface with appropriate get and set methods for properties
	public class Car extends Vehicle_mku_03 implements VehicleInterface_mku_03 {
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
		
		@Override
		public String sound() {
			String sound = "vroom vroom";
			return sound;
		}
		
		@Override
		public String seats() {
			String seats = "2+";
			return seats;
		}
	}
	
	public class Bike extends Vehicle_mku_03 implements VehicleInterface_mku_03 {	
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
		@Override
		public String sound() {
			String sound = "beep beep";
			return sound;
		}
		
		@Override
		public String seats() {
			String seats = "1";
			return seats;
		}
		
		public String display() {
			String display = "A " + type + " is " + safety + " as it goes at a " + speed + " speed";
			return display;
		}
	}
}
