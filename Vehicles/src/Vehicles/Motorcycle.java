package Vehicles;

public class Motorcycle extends Vehicle {

private int handleBarWidth;
	
	public Motorcycle(int ID, String colour, String manufacturer, double price, int handleBarWidth) {
		super(ID, "Motorcycle", colour, manufacturer, price);
		this.handleBarWidth = handleBarWidth;
	}
	
	public void setHandleBarWidth(int handleBarWidth) {
		this.handleBarWidth = handleBarWidth;
	}
	
	public int getHandleBarWidth() {
		return this.handleBarWidth;
	}
	
	public void popWheelie() {
		System.out.println("I should probably never do this again...");
	}

	@Override
	public double calculateBill() {
		return this.getHandleBarWidth() * 39.99;
	}
}
