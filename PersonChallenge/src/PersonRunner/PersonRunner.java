package PersonRunner;


import Person.Person;
import PersonList.PersonList;
import Pet.Pet;
public class PersonRunner {

	public static void main(String[] args) {
		
	Person personOne = new Person ("Adam", 31, "Gym Coach", "cat");
	Person personTwo = new Person ("Becky", 28, "Piano Teacher", "dog");

	//System.out.println(personOne);
	 
	PersonList p = new PersonList();
    
	p.addPerson(personOne);
    p.addPerson(personTwo);
   
    Pet shark = new Pet("Shark", "Sharky", 30, "Fish");
	Pet dog = new Pet("Dog - Labrador", "Buddy", 3, "Dog food");
	
	personOne.addPet(shark);
	personTwo.addPet(dog);
    
    //p.findByNameStream("adam");
	p.printStream();

	}
}
