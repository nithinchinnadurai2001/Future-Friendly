package com.chainsys.loops;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month (1 to 12) : ");
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1, 2, 3:
			System.out.println("Spring Season");
		    break;
		case 4, 5, 6:
			System.out.println("Summer Season");
		    break;
		case 7, 8, 9:
	        System.out.println("Monsoon Season");
		    break;
		case 10, 11, 12:
			System.out.println("Winter Season");
		    break;
		default:
		    System.out.println("Enter Valid Month Number : ");
		}    
	}

}
