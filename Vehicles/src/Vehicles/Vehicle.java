package Vehicles;

public abstract class Vehicle {
	
	private String type; 
	private String manufacturer;
	private String colour;
	private double price;
	private int ID; 
	
	public Vehicle (int ID, String type, String manufacturer, String colour, double price) {
		this.ID = ID;
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public abstract double calculateBill();

	@Override
	public String toString() {
		return String.format(
				"ID: %d | This vehicle is a %s %s in the colour %s and costs %.2f", 
				this.ID, this.colour, this.getClass().getSimpleName(), this.manufacturer, this.price
		);
	}
}
