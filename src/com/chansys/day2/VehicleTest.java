package com.chansys.day2;

public class VehicleTest {

	public static void main(String[] args) {
	     Vehicle veh1 = new Vehicle();
	     veh1.name = "Royal Enfield";
	     veh1.price = 20000000;
	     veh1.vehicleNumber = "TN55BH2018";
	     veh1.availability = true;
	     veh1.mobileNo = 8765439870l;
	     System.out.println("Vehicle Name : " + (veh1.name) + "\n" + "Vehicle Price : " + (veh1.price) + "\n" + "Vehicle Number : " + (veh1.vehicleNumber) + "\n" + "Availability : " + (veh1.availability) + "\n" + "Mobile No : " + (veh1.mobileNo));
	}

}
