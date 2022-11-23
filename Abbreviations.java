package com.chainsys.string;

import java.util.Scanner;

public class Abbreviations {

	public static void main(String[] args) {
		
		System.out.println("Enter Name : ");
		Scanner sc = new Scanner(System.in);
	    String st = sc.nextLine();
	    String sr = "";
	    sr = sr + st.charAt(0);
	    sr = sr + ". ";
	    for (int i = 0; i < st.length(); i++){
	      if(st.charAt(i) == ' ' && st.charAt(i + 1) != ' ' && i + 1 < st.length()){
	        sr = (sr + st.charAt(i + 1)).toUpperCase();
	        sr = sr + ". ";
	      }
	    }
	    String lastwrd = "";
	    
	    for(int i = st.length() - 1; i >= 0; i--){
	      if(st.charAt(i) == ' '){
	        lastwrd = st.substring(i + 2);
	        break;
	      }
	    }
	    
	    sr = sr.substring(0,sr.length() - 2);
	    sr = sr + lastwrd;
	    System.out.println(sr);

	}

}
