package Animal;

public class Dog extends Animals{

	public Dog(String name, Boolean carnivore) {
		super(name, carnivore);
	}
	
	@Override
    public void sound(){
        System.out.println("sound = woof");
        
    }
}
