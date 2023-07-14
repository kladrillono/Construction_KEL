
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
		
	}// empty constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super();
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		
	}// preferred constructor
	
	public int getNumRentableUnits() {
		
		return numRentableUnits;
		
	} // getter for NumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		
		this.numRentableUnits = numRentableUnits;
		
	} // setter for NumRentableUnits

	public double getAvgUnitSize() {
		
		return avgUnitSize;
		
	} // getter for AvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		
		this.avgUnitSize = avgUnitSize;
		
	} // setter for unit size

	public boolean isParkingAvailable() {
		
		return parkingAvailable;
		
	} // getter for parking available

	public void setParkingAvailable(boolean parkingAvailable) {
		
		this.parkingAvailable = parkingAvailable;
		
		if (parkingAvailable == true) {
			System.out.println("Y");
		}
		else if (parkingAvailable == false) {
			System.out.println("N");
		}
	}// setter for parking available

	public void draw() {
	
		System.out.println("Drawing code for Apartment");
		
	} // end Draw method for Apartments
	
	public String displayData() {
		
		return toString(); 
		
	} // end displayData

	@Override
	public String toString() {
		return "Apartment" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Rentable Units: " + numRentableUnits + "\n" + "Average Unit Size: " + avgUnitSize
				+ "\n" + "Parking Available: " + parkingAvailable;
	} // end toString
	
	
	
}// end class
