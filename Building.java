
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	public Building() {
	
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	
	} //end empty constructor

	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
	
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	
	}// end preferred constructor
	
	public String getProjectName() {
		return projectName;
	}// getter for ProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}// setter for ProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}// getter for CompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}// setter for CompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}// getter for TotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}// setter for TotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}// getter for OccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}// setter for OccupancyGroup

	public String getSubgroup() {
		return subgroup;
	} //getter for Subgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}// setter for Subgroup

	public void draw() {
	
		System.out.println("Drawing code for Building");
		
	} //will be used to draw the object to the screen. All draw methods in subclasses will do this.
	
	public String displayData() {
		
		return toString();
				
	}// will return a formatted string that contains all info about the object

	@Override
	public String toString() {
		return "Building" +"\n"+ "Project Name: " + projectName + "\n" + "Address: " + completeAddress + "\n" + "Square Feet: "
				+ totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup + "\n" + "Occupancy Subgroup: " + subgroup;
	}// end toString
	
	
	
} // end class


