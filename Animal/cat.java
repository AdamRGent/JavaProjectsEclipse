package Animal;

public class cat extends Animals {


	public cat(String name, Boolean carnivore) {
		super(name, carnivore);
	}
	
	
	
	@Override
    public void sound(){
        System.out.println("Sound = meow");
    }
}
