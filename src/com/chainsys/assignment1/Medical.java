package com.chainsys.assignment1;

import java.util.Scanner;

public class Medical {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Classes : ");
		System.out.println("Enter The Number of Clsses Held : ");
		int classes = sc.nextInt();
		int held = sc.nextInt();
		System.out.println("Percentage of Class Attended");
		int percentage = sc.nextInt();
		System.out.println("Have a Medical Certificate");
		String medicalCertificate = sc.next();
		
		if(percentage >= 75)
		{
			System.out.println("Student is Allowed to sit in Exam");
		}
		else if(medicalCertificate.equals("Yes"))
		{
			System.out.println("Student is Allowed to sit in Exam");
		}
		else if(percentage < 75)
		{
			System.out.println("Student is Not Allowed to sit in Exam");
		}
		else
		{
			System.out.println("Not Valid");
		}

	}

}
