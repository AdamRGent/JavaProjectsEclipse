package AnimalShelter;

public class Cat extends Animal{
	
	private int hoursOfPlay; 
	
	public Cat (int ID, String type, int sizeKG, int duration_in_days, int hoursOfPlay) {
		super (ID, "Cat", sizeKG, duration_in_days);
		this.hoursOfPlay = hoursOfPlay;
	}

	public void sethoursOfPlay (int hoursOfPlay){
		this.hoursOfPlay = hoursOfPlay;
	}
	
	public int gethoursOfPlay (){
		return this.hoursOfPlay;
	}
	
	
	public double calculateOverallBill() {
		return ((20 * hoursOfPlay) + calculateBill());

}
	
	@Override
	public String toString() {
		return String.format("ID:" + this.getID() +" " + "Type:" + this.gettype() +", " + "Weight(kg,s):" + this.getSizeKG() +" " + "Length of stay:" + this.getDuration_in_days() + " " + "Hours of Play:" + hoursOfPlay + ", " + "Charge:" + calculateOverallBill());
}
}

