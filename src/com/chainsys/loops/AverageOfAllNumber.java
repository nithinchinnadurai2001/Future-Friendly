package com.chainsys.loops;

import java.util.Scanner;

public class AverageOfAllNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int sum = 0;
		float average; 
		
		for(int i = 1; i <= num; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of Integer : " + sum);
		average = sum/num;
		System.out.println("Average Is : " + average);

	}

}
