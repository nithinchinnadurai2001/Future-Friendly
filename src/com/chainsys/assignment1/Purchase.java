package com.chainsys.assignment1;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Purchased Quantity : ");
		double purQuantity = sc.nextDouble();
		
		if(purQuantity>10000)
		{
			System.out.println("The Total Cost = " +(purQuantity-(purQuantity/100*10)));
		}
		else
		{
			System.out.println("The Total Cost = " + purQuantity);
		}

	}

}
