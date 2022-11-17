package com.chainsys.assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num1 : ");
		System.out.println("Enter a num2 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Choose an operator : +, -, * or /");
		operator = sc.next().charAt(0);
        
		if(operator == '+')
		{
			System.out.println("Add : " + (num1+num2) );
		}
		 else if(operator == '-')
		 {
			System.out.println("Sub : " + (num1-num2));
		 }
		 else if(operator == '*') 
		 {
			System.out.println("Mul : " + (num1*num2));
		 }
		 else if(operator == '/')
		 {
			System.out.println("Div : " + (num1/num2));
		} 
		else 
			System.out.println("Invaild");
	}

}
