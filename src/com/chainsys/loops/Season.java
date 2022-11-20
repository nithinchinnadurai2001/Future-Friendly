package com.chainsys.loops;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month (1 to 12) : ");
		int month = sc.nextInt();
		
		if(month <= 3 && month >= 1)
		{
			System.out.println("Spring Season");
		}
		else if(month <= 6 && month >= 4)
		{
			System.out.println("Summer Season");
		}
		else if(month <= 9 && month >= 7)
		{
			System.out.println("Monsoon Season");
		}
		else if(month <= 12 && month >= 10)
		{
			System.out.println("Winter Season");
		}
		else
			System.out.println("Invalid");

	}

}
