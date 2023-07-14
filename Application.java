
public class Application {

	public static void main(String[] args) {
		
		Building bldg1 = new Building("Groot's House", "777 Outer Space Dr. New York City, NY 12345", 10000.0, "Residential", "G1");
		
		//bldg1.setProjectName("Groot's House");
		//System.out.println(bldg1.getProjectName());
		
		//bldg1.setCompleteAddress("777 Outer Space Dr. New York City, NY 12345");
		//System.out.println(bldg1.getCompleteAddress());
		
		//bldg1.setTotalSquareFeet(10000.0);
		//System.out.println(bldg1.getTotalSquareFeet());
		
		//bldg1.setOccupancyGroup("Residential");
		//System.out.println(bldg1.getOccupancyGroup());
		
		//bldg1.setSubgroup("G1");
		//System.out.println(bldg1.getSubgroup());
		
		//bldg1.draw();
		
		//System.out.println(bldg1.displayData());
		
		//System.out.println(bldg1.toString());
		
		// end Building test code
		
		Business business1 = new Business("Purple Ice Cream Shoppe", "456 Main Street Louisville, KY 40201", 3000.0, "Business", "B1");
		
		//business1.setNumRentableUnits(4);
		//System.out.println(business1.getNumRentableUnits());
		
		//System.out.println(business1.toString());
		
		// end Business test code
		
		Residential residential1 = new Residential("Grandma's House", "54 Red Pine Dr. San Diego, CA 91911", 2200.0, "Residential", "H1");
		
		//residential1.setNumBedrooms(3);
		//System.out.println(residential1.getNumBedrooms());
		
		//residential1.setNumBathrooms(2);
		//System.out.println(residential1.getNumBathrooms());
		
		//residential1.setLaundryRoom(true);
		//System.out.println(residential1.isLaundryRoom());
		
		//System.out.println(residential1.toString());
		
		// end Residential test code
		
		Mall mall1 = new Mall("Mountain View Mall", "628 Cherry Ln Portland, Oregon 35841", 50000.0, "Business", "M1");
		
		//mall1.setNumRentedUnits(98);
		//System.out.println(mall1.getNumRentedUnits());
		
		//mall1.setMedianUnitSize(1100);
		//System.out.println(mall1.getMedianUnitSize());
		
		//mall1.setNumParkingSpaces(500);
		//System.out.println(mall1.getNumParkingSpaces());
		
		//mall1.draw();
		
		//System.out.println(mall1.displayData());
		
		//System.out.println(mall1.toString());
		
		// end Mall test code
		
		Apartment apt1 = new Apartment("Wildflower Apartments", "953 Starry Lane Seattle, WA 37946", 3400.0, "Residential", "G5");
		
		//apt1.setNumRentableUnits(40);
		//System.out.println(apt1.getNumRentableUnits());
		
		//apt1.setAvgUnitSize(1100.0);
		//System.out.println(apt1.getAvgUnitSize());
		
		//apt1.setParkingAvailable(true);
		//System.out.println(apt1.isParkingAvailable());
		
		//apt1.draw();
		
		//System.out.println(apt1.displayData());
		
		//System.out.println(apt1.toString());
		// end Apartment test code
		
		SingleFamilyHome home1 = new SingleFamilyHome("Schmidt Family", "364 West View Rd, Dallas, TX 27368", 4100.0, "Residential", "D4");
		
		//home1.setNumBedrooms(4);
		//System.out.println(home1.getNumBedrooms());
		
		//home1.setNumBathrooms(5);
		//System.out.println(home1.getNumBathrooms());
		
		//home1.setLaundryRoom(true);
		//System.out.println(home1.isLaundryRoom());
		
		//home1.setGarage(true);
		//System.out.println(home1.isGarage());
		
		//home1.draw();
		
		//System.out.println(home1.displayData());
		
		//System.out.println(home1.toString());
		
		// end SingleFamilyHome test code
		
	}// end main

}// end class
