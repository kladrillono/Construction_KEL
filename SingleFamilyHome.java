
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	public SingleFamilyHome() {
		
		super();
		garage = false;
		
	} // empty constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		
	} //preferred constructor
	
	public boolean isGarage() {
		
		return garage;
		
	} // getter for garage

	public void setGarage(boolean garage) {
		
		this.garage = garage;
		
		if (garage == true) {
			System.out.println("Y");
		}
		
		if (garage == false) {
			System.out.println("N");
		}
		
	}// setter for garage

	public void draw() {
		
		System.out.println("Drawing code for Single Family Home");
		
	} // end draw method for Single Family Home
	
	public String displayData() {
		
		return toString();
		
	} // end displayData

	@Override
	public String toString() {
		return "Single Family Home" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "Subgroup: " + subgroup + "\n" + "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms
				+ "\n" + "Laundry Room: " + laundryRoom + "\n" + "Garage: " + isGarage();
	} // end toString
	
	
}//end class
