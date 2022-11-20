package com.chainsys.loops;

import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of Integer : " + sum);

	}

}