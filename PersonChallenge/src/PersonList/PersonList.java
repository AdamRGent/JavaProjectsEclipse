package PersonList;

import java.util.ArrayList;
import java.util.List;

import Person.Person;

public class PersonList {

	List<Person> PersonsList = new ArrayList<Person>();
	
	public PersonList () {}
	
	public PersonList (List<Person> PersonsList) {
		this.PersonsList = PersonsList;
}
	
	public void addPerson(Person person) {
		PersonsList.add(person);
	}
	
	
	public void removePerson(Person person) {
		PersonsList.remove(person);
	}
	
	public void findByNameStream(String name) {
		this.PersonsList.stream().forEach(p -> {if(p.getName().equalsIgnoreCase(name)) System.out.println(p);});
	
}
	
	public void printStream() {
		this.PersonsList.stream().forEach(p -> System.out.println(p));
}
		
	}


