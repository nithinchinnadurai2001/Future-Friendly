package com.chainsys.loops;

import java.util.Scanner;

public class MaxTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Element : ");
		int numElement = sc.nextInt();
		
		int array[] = new int[numElement];
		System.out.println("Enter All The Element : ");
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		
		int large1, large2, temp;
		large1 = array[0];
		large2 = array[1];
		
		if(large1 < large2)
		{
			temp = large1;
			large1 = large2;
			large2 = temp;
		}
		
		for(int i = 2; i < array.length; i++)
		{
			if(array[i] > large1)
			{
				large2 = large1;
				large1 = array[i];
			}
			else if(array[i] > large2 && array[i] != large1)
			{
				large2 = array[i];
			}
		}
		
		System.out.println("The First Largest Number Is : " + large1);
		System.out.println("The Second Largest Number Is : " + large2);
		
	}

}
