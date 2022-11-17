package com.chainsys.assignment1;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of Classes Held : ");
		int held = sc.nextInt();
		System.out.println("Enter a number Classes Attend : ");
		int attend = sc.nextInt();
        float percentage;
        percentage = ((attend*100)/held);
        System.out.println(percentage);
        if(percentage>=75)
        {
        	System.out.println("Yu are allowed to sit in exam ");
        }
            else
        {
        	System.out.println("Yu are not allowed to sit in exam");
        }
		
	}

}
