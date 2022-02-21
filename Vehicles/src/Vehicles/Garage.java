package Vehicles;

import java.util.ArrayList;

public class Garage {

private ArrayList<Vehicle> Vehicle = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle Vehicle) {
		this.Vehicle.add(Vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.Vehicle.remove(v)) {
			System.out.println("\n\nVehicle removed.");
		} else {
			System.out.println("\n\nVehicle not found.");
		}
	}
	
	public void removeVehiclesByType(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle Vehicle : Vehicle) {
			if (Vehicle.getType() == type) {
				found.add(Vehicle);
			}
		}
		for(Vehicle destroy: found) {
			Vehicle.remove(destroy);
		}
	}
	
	public void removeVehicleById(int ID) {
		Vehicle found = null;
		for (Vehicle Vehicle : Vehicle) {
			if (Vehicle.getID() == ID) {
				found = Vehicle;
			}
		}
		removeVehicle(found);
	}
	
	public void emptyGarage() {
		System.out.println("\n\nVehicle(s) removed.");
		this.Vehicle.clear();
	}
	
	public void getBillByID(int ID) {
		for (Vehicle Vehicle : this.Vehicle) {
			if (Vehicle.getID() == ID) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println(String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", Vehicle.getColour(), Vehicle.getManufacturer(), ID, Vehicle.calculateBill()));
				break;
			}
		}
	}
	
	public void calculateIndividualBills() {
		for (Vehicle Vehicle : this.Vehicle) {
			System.out.println("--------------------------------------------------------------------------------------------");
			String output = String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", Vehicle.getColour(), Vehicle.getManufacturer(), Vehicle.getID(), Vehicle.calculateBill());
			System.out.println(output);
		}
	}
	
	public void calculateTotalBill() {
		double total = 0;
		for (Vehicle Vehicle : this.Vehicle) {
			total += Vehicle.calculateBill();
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\nThe total bill for all vehicles in the garage is: £" + total);
	}
	
	public void printAll() {
		System.out.println("\n\n--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Full list of vehicles---------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (Vehicle vehicle : this.Vehicle) {
			System.out.println(vehicle);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
	
	
}
