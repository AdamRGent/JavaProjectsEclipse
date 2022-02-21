package AnimalShelter;

public abstract class Animal {

	private int ID;
	private String type;
	private int sizeKG;
	private int duration_in_days; 
	
	public Animal (int ID, String type, int sizeKG, int duration_in_days){
		this.ID = ID; 
		this.type = type;
		this.setSizeKG(sizeKG);
		this.setDuration_in_days(duration_in_days); 
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public void settype(String type) {
		this.type = type;
	}
	public void setsizeKG(int sizeKG) {
		this.setSizeKG(sizeKG);
	}
	public void setduration_in_days(int duration_in_days) {
		this.setDuration_in_days(duration_in_days);
	}
	public int getID() {
		return this.ID;
	}
	public String gettype() {
		return this.type;
	}
	public int getsizeKG() {
		return this.getSizeKG();
	}
	public int getduration_in_days() {
		return this.getDuration_in_days();
	}
	
	public double calculateBill() {
		return duration_in_days *60;
	}

	@Override
	public String toString() {
		return String.format("ID:" + this.ID +" " + "Type:" + this.type +", " + "Weight(kg,s):" + this.getSizeKG() +" " + "Length of stay:" + this.getDuration_in_days() + " " + "Charge:" + calculateBill());
}
	public int getDuration_in_days() {
		return duration_in_days;
	}
	public void setDuration_in_days(int duration_in_days) {
		this.duration_in_days = duration_in_days;
	}
	public int getSizeKG() {
		return sizeKG;
	}
	public void setSizeKG(int sizeKG) {
		this.sizeKG = sizeKG;
	}

		
	}
