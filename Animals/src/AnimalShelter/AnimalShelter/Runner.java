package AnimalShelter;



public class Runner {
	
	public static void main(String[] args) {
	
		Dog dOne = new Dog(1, "Dog", 33, 7, 5);
		Cat  cOne = new Cat(2, "Cat", 10, 5, 2);
	
		
	
		Shelter Shelter = new Shelter();
		Shelter.addAnimal(dOne);
		Shelter.addAnimal(cOne);
	
		Shelter.printAll();
		
	}
}



