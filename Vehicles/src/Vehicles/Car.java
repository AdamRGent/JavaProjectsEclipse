package Vehicles;

public class Car extends Vehicle {
	
	private boolean hasSunRoof;
	private int numOfDoors;
	
	public Car(int ID, String colour, String manufacturer,double price, int numOfDoors, boolean hasSunRoof) {
		super(ID, "Car", colour, manufacturer, price);
		this.numOfDoors = numOfDoors;
		this.hasSunRoof = hasSunRoof;	
	}
	
	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}
	
	public boolean getHasSunRoof() {
		return this.hasSunRoof;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	public int getNumOfDoors() {
		return this.numOfDoors;
	}

	@Override
	public double calculateBill() {
		double cModifier = this.getNumOfDoors() * 10;
		return 49.99 * cModifier;
	}

}
