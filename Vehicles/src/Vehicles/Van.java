package Vehicles;

public class Van extends Vehicle {

private int storageSpace;
	
	public Van(int ID, String colour, String manufacturer, double price, int storageSpace) {
		super(ID, "Van", colour, manufacturer, price);
		this.storageSpace = storageSpace;
	}
	
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	
	public int getStorageSpace() {
		return this.storageSpace;
	}

	@Override
	public double calculateBill() {
		double vModifier = this.getStorageSpace() / 100;
		return 99.99 * vModifier;
	}
}
