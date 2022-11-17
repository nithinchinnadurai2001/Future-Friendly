package com.chainsys.assignment1;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principl Amount : ");
		int principle = sc.nextInt();
		System.out.println("Enter the Interest Percentage : ");
		int interest = sc.nextInt();
		System.out.println("Enter The Term : ");
		int term = sc.nextInt();
        int rate = (principle/interest)*term;
		System.out.println("Rate of Interest : " + rate);
		int total = principle + rate;
		System.out.println("Total Amount to be Paid : " + total);
		int month = total/(term*12);
		System.out.println("Paid per Month : " + month);
		for(int i = total; i >= 0;)
		{
			System.out.println("" + i);
			i = i - month;
		}
		
	}

}
