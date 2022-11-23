package com.chainsys.string;

public class HelloWorld {

	public static void main(String[] args) {
		
		String find = "Hello, World";
		System.out.println("The First 'o' Position Is : " + find.indexOf('o'));
		System.out.println("The ',' Position Is : " + find.indexOf(','));
		System.out.println("The Last 'o' Position Is : " + find.lastIndexOf('o'));
		System.out.println("The ',' Position Is : " + find.lastIndexOf(','));

	}

}
