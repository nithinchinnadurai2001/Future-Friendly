package com.chansys.day2;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArithmeticOperator1 call = new ArithmeticOperator1();
		System.out.println("Enter Any Two Number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		call.a = num1;
		call.b = num2;
	    System.out.println("Sum of given number : " + (num1 + num2));
	    System.out.println("Subtraction of given number : " + (num1 - num2));
	    System.out.println("Multiple of given number : " + (num1 * num2));

	}

}
