package com.chainsys.day3;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String state = "Kerala";
        System.out.println("Enter Your Age : ");		
		int userAge = sc.nextInt();
		if(userAge > 18) {
			System.out.println("Enter Your Nationality : ");
			String nationality = sc.next();
			if(nationality.equals("Indian")) {
				System.out.println("Enter Your State :");
				state = sc.next();
				if(state.equals("Karnataka") || (state.equals("Tamil Nadu")))
					System.out.println("User is Elegible to vote");
				
				else if(state.equals("Andhra")) {
					System.out.println("No Election in Your State Now");
				}
			} else
				System.out.println("You Are Not An Indian");
			
		} else
			System.out.println("Not Elegible");
		
	} 

}
