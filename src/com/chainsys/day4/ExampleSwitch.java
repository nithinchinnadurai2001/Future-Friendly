package com.chainsys.day4;

public class ExampleSwitch {

	public static void main(String[] args) {
	     String programmingLanguage = "Java";
	     switch(programmingLanguage)
	     {
	     case "Java":
	    	 System.out.println("Platform Independent Language");
	    	 break;
	     
	     case "HTML":
	     {
	    	 System.out.println("Markup Language");
	         break;
	     }
	     default:
	         System.out.println("Invalid");

	 }

  }

}