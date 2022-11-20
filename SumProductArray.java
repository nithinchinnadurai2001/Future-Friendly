package com.chainsys.Array;

import java.util.Scanner;

public class SumProductArray {

	public static void main(String[] args) {

		int sum = 0, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Element : ");
		int num = sc.nextInt();
		int array[] = new int[num];
		System.out.println("Enter All The Element : ");
        
		for(int i = 0; i < num; i++)
		{
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) 
		{
			
			sum = sum + array[i];
			product = product * array[i];
			
		}
		System.out.println("Sum : " + sum);
		System.out.println("Product : " + product);

	}
}
