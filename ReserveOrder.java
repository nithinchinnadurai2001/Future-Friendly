package com.chainsys.Array;

import java.util.Scanner;

public class ReserveOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int array1[] = new int [10];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter The value of array["+i+"]");
			array[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = array1.length - 1; i >= 0; i--)
		{
			array1[i] = array[j];
			j++;
		}
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("The value of array1["+i+"] Is : " + array1[i]);
		}

	}

}
