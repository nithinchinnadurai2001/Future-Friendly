package com.chainsys.loops;

import java.util.Scanner;

public class OddEvenRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range of Number : ");
		int range = sc.nextInt();
		
		for(int i = 1; i <= range; i++)
		{
		   if(i % 2 == 0 )
		  {
			System.out.println(i + " Is Even");
		}
		else
			System.out.println(i + " Is Odd");

	   }

	}	
}
