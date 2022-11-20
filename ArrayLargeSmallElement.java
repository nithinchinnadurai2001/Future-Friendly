package com.chainsys.Array;

import java.util.Scanner;

public class ArrayLargeSmallElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Element : ");
		int num = sc.nextInt();
		int array[] = new int[num];
		System.out.println("Enter All The Element : ");
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		
		int small = array[0];
		int large = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > large)
			{
				large = array[i];
			}
			else if(array[i] < small)
			{
				small = array[i];
			}
		}
		
		System.out.println("Smallest Number Is : " + small);
		System.out.println("Largest Number Is : " + large);


	}

}
