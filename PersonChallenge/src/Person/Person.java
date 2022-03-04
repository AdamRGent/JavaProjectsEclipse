package Person;

import java.util.ArrayList;
import java.util.List;

import Pet.Pet;

public class Person {

	private String name;
	private int age;
	private String JobTitle;
	private List<Pet> pets =  new ArrayList<>();

	
public Person() {}
	
	public Person(String name, int age, String JobTitle, String petType) {
		this.name = name;
		this.age = age;
		this.JobTitle = JobTitle;
		
		}

	public Person(String name, int age, String JobTitle, List<Pet> pets) {
		super();
		this.name = name;
		this.age = age;
		this.JobTitle = JobTitle;
		this.pets = pets;
	
	}
	
	public void addPet(Pet pet) {
		this.pets.add(pet);
		
	}
	
	public void removePet(Pet pet) {
		this.pets.remove(pet);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	
	@Override
	public String toString(){
	    return "Person Name = " + this.name + "\nAge =  " 
	+ this.age + " \nJob Title = " +this.JobTitle + "\n\nAll of " 
			+ name + "'s pets:" + pets;
	
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
}
