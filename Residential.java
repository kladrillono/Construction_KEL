
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
		
	}//empty constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super();
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		
	}//preferred constructor

	public int getNumBedrooms() {
		return numBedrooms;
	}// getter for NumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	} // setter for NumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	} // getter for NumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	} // setter for NumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	} // setter for NumBathrooms

	public void setLaundryRoom(boolean laundryRoom) {
		
		this.laundryRoom = laundryRoom;
		
		if (laundryRoom == true) {
			System.out.println("Y");
		}
		if (laundryRoom == false) {
			System.out.println("N");
		}
	} // setter for LaundryRoom

	@Override
	public String toString() {
		return "Residential" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: " + completeAddress
				+ "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup + "\n" + "Subgroup: "
				+ subgroup + "\n" + "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms + "\n" + "Laundry Room: "
				+ laundryRoom ;
	}// end toString
	
	
	
}
