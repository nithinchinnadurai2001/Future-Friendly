package com.chansys.day2;

import java.util.Scanner;

public class BusTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bus bus = new Bus();
		System.out.println("Enter Your Bus Name : ");
		String name = sc.next();
		System.out.println(name);
		System.out.println("Enter Your Source : ");
		String source = sc.next();
		System.out.println(source);
		System.out.println("Enter Your Designation : ");
		String designation = sc.next();
		System.out.println(designation);
		System.out.println("Enter Your Bus Colour : ");
		String colour = sc.next();
		System.out.println(colour);
	}

}