package com.chansys.day2;

public class HospitalTest {

	public static void main(String[] args) {
		Hospital hos1 = new Hospital();
		hos1.name = "Apolo";
		hos1.numberOfDocters = 53;
		hos1.numberOfNurse = 1200;
		hos1.mobileNo = 9876549870l;
		hos1.address = "No.85, Ponniamman Nagar, Ayanapakam, Chennai.";
		System.out.println("Hospital Name : " + (hos1.name) + "\n" + "Number Of Docters : " + (hos1.numberOfDocters)  + "\n" + "Number Of Nurse : " + (hos1.numberOfNurse) + "\n" + "Mobile No : " + (hos1.mobileNo) + "\n" + "Address : " + (hos1.address) ); 

	}

}
