package com.chainsys.assignment1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our Bank");
		System.out.println("Enter Your Account Number : ");
		long accountNumber = sc.nextLong();
		System.out.println("Enter Your Phone Number : ");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter Your Pin");
		int pin = sc.nextInt();
		if((pin == 4532) || (phoneNumber == 898765431))
        {
        	System.out.println("Please Enter a Withdraw Amount : ");
            int amount = sc.nextInt();
            System.out.println("Please Collect Your Withdraw Amount");
        	
        }
		else
		{
			System.out.println("Pin Not Valid");
		}
        
	}

}
