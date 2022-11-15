package com.chansys.day2;

public class HotelTest {

	public static void main(String[] args) {
		Hotel h1 = new Hotel();
		h1.name = "Jaag Hotel";
		h1.numberOfTables = 23;
		h1.category = "Veg";
		h1.rating = 4.3f;
		h1.address = "No.92, Gopathi street, parthasarathi Puram, chennai";
		h1.contact = 9876543210l;
		System.out.println("Hotel Name : " + (h1.name) + "\n" + "NumberOfTables : " + (h1.numberOfTables) + "\n" + "Category : " + (h1.category) + "\n" + "Address : " + (h1.address) + "\n" + "Rating : " + (h1.rating) + "\n" + "Contact : " + (h1.contact));

	}

}
