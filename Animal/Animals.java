package Animal;

public class Animals {

	private String name;
	private Boolean carnivore; 
	
	public Animals () {}
	
	public Animals (String name, Boolean carnivore) {
	super();
	this.name = name;
	this.carnivore = carnivore;
	}
	public void sound(){
        System.out.println("growl");}
	
	public String getname () {
		return name;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public Boolean getcarnivore () {
		return carnivore;
		
	}
	
	public void setcarnivore(Boolean carnivore){
		this.carnivore = carnivore;
	}
	
	@Override
	public String toString() {
		return "Animals [name = " + name + ", carnivore = " + carnivore + "]";
	}
	
}
	



