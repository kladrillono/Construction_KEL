
public class Business extends Building {

	protected int numRentableUnits;

	public Business() {
		
		super();
		numRentableUnits = 0;
		
	}//empty constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		
	}//preferred constructor
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}// getter for numRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} // setter for numRentableUnits

	@Override
	public String toString() {
		return "Business" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Rentable Units: " + numRentableUnits;
	}// end toString
	
	
	
	
	
	
}//end class
