package com.chainsys.loops;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		

	    int i = num;
	    
		if(i % 3 == 0 && i % 5 == 0)
		{
				System.out.println("FizzBuzz");
		}
		else if(i % 5 == 0)
		{
				System.out.println("Buzz");
		}
		else if(i % 3 == 0)
		{
				System.out.println("Fizz");
		}
		else 
				System.out.println(i);
		}
	
	
}


