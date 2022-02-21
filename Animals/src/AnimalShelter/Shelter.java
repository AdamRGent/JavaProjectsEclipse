package AnimalShelter;

import java.util.ArrayList;

public class Shelter {

private ArrayList<Animal> Animal = new ArrayList<Animal>();
	
	public void addAnimal(Animal Animal) {
		this.Animal.add(Animal);
	}
	
	public void removeAnimal(Animal A) {
		if (this.Animal.remove(A)) {
			System.out.println("\n\nAnimalreleased.");
		} else {
			System.out.println("\n\nAnimal not found.");
		}
	}
	
	public void removeAnimalBytype(String type) {
		ArrayList<Animal> found = new ArrayList<Animal>();
		for (Animal Animal : Animal) {
			if (Animal.gettype() == type) {
				found.add(Animal);
			}
		}
		for(Animal destroy: found) {
			Animal.remove(destroy);
		}
	}
	
	public void removeAnimalById(int ID) {
		Animal found = null;
		for (Animal Animal : Animal) {
			if (Animal.getID() == ID) {
				found = Animal;
			}
		}
		removeAnimal(found);
	}
	
	public void emptyShelter() {
		System.out.println("\n\nAnimal(s) released.");
		this.Animal.clear();
	}

	public void getBillByID(int ID) {
		for (Animal Animal : this.Animal) {
			if (Animal.getID() == ID) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println(String.format("ID:" + Animal.getID()+" " + "Type:" + Animal.gettype() +", " + "Weight(kg,s):" + Animal.getsizeKG() +" " + "Length of stay:" + Animal.getDuration_in_days() + " " + "Charge:" + calculateOverallBill()));

			}
		}
	}
	
	
	
	public void calculateTotalBill() {
		double total = 0;
		for (Animal Animal : this.Animal) {
			total += Animal.calculateBill();
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\nThe total bill for all animals in the shelter is: £" + total);
	}
	
	public void printAll() {
		System.out.println("\n\n--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Full list of Animals---------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (Animal Animal : this.Animal) {
			System.out.println(Animal);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
		
	}
		
	

