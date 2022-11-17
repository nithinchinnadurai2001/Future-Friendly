package com.chainsys.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 1;
		System.out.println("Enter the Number of Term : ");
		int term = sc.nextInt();
		System.out.println("First " + term + " Term of Fibonacci series : ");
		
		for(int i = 1; i <= term; ++i)
		{
			System.out.println(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}


	}

}
