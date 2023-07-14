
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
		
	}// empty constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super();
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		
	}// preferred constructor
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	} // getter for NumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	} // setter for NumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	} // getter for MedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	} // setter for MedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	} // getter for NumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	} // setter for NumParkingSpaces

	public void draw() {
		
		System.out.println("Drawing code for Mall");
		
	} // end draw method for Mall
	
	public String displayData() {
		
		return toString();
		
	} // end displayData method

	@Override
	public String toString() {
		return "Mall" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: " + completeAddress + "\n"
				+ "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup + "\n" + "Subgroup: "
				+ subgroup + "\n" + "Number of Rented Units: " + numRentedUnits + "\n" + "Median Unit Size: " + medianUnitSize + "\n" + "Number of Parking Spaces: "
				+ numParkingSpaces;
	} //end toString

	
}// end class

