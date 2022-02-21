package Vehicles;


public class Runner {

	public static void main(String[] args) {
		// Vehicle Block
		Car cOne = new Car(1, "black", "Ford", 25999.99, 5, false);
		Motorcycle mOne = new Motorcycle(2, "yellow", "ducati", 19999.99, 50);
		Van vOne = new Van(3, "red", "mercedes", 24999.99, 5000);
		
		// Garage Block
		Garage garage = new Garage();
		garage.addVehicle(cOne);
		garage.addVehicle(mOne);
		garage.addVehicle(vOne);
		
		// Method test blocks
		garage.printAll();
		
		garage.getBillByID(1);
		garage.calculateIndividualBills();
		garage.calculateTotalBill();
		
		garage.removeVehicleById(1);
		garage.printAll();
		
		garage.removeVehiclesByType("Van");
		garage.printAll();
		
		garage.emptyGarage();
		garage.printAll();
		
		garage.addVehicle(cOne);
		garage.printAll();
		
		garage.removeVehicle(cOne);
		garage.printAll();
	}
}
