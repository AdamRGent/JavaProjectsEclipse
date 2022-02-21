package AnimalShelter;

public class Dog extends Animal {
	
	private int numberOfWalksPerDay;
	
	
	public Dog (int ID, String type, int sizeKG, int duration_in_days, int numberOfWalksPerDay) {
		super (ID, "Dog", sizeKG, duration_in_days);
		this.numberOfWalksPerDay = numberOfWalksPerDay;
	}

	public void setnumberOfWalksPerDay (int numberOfWalksPerDay){
		this.numberOfWalksPerDay = numberOfWalksPerDay;
	}
	
	public int getnumberOfWalksPerDay (){
		return this.numberOfWalksPerDay;
	}
	
	
	public double calculateOverallBill() {
		return ((20 * numberOfWalksPerDay)+ calculateBill());
}
	
	@Override
	public String toString() {
		return String.format("ID:" + this.getID() +" " + "Type:" + this.gettype() +", " + "Weight(kg,s):" + this.getSizeKG() +" " + "Length of stay:" + this.getDuration_in_days() + " " + "Number of walks per day:" + numberOfWalksPerDay + ", " + "Charge:" + calculateOverallBill());
}
}
