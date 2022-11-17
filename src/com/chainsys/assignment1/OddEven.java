package com.chainsys.assignment1;

import java.util.Scanner; 

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0 )
		{
			System.out.println("Is Even");
		}
		else
			System.out.println("Is Odd");

	}

}
