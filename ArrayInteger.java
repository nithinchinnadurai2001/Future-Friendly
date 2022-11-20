package com.chainsys.Array;

import java.util.Scanner;

public class ArrayInteger {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    int array[] = new int[20];
	    int pos = 0;
	    int neg = 0;
	    int odd = 0;
	    int even = 0;
	    int zero = 0;
	    for(int i = 0;i<array.length;i++){
	      System.out.println("Print the value of array["+i+"]");
	      array[i] = s.nextInt();

	      if(array[i]>0){
	        pos++;
	      }
	      else if(array[i]<0){
	        neg++;
	      }
	      else{
	        zero++;
	      }
	      if(array[i]%2==0){
	        even++;
	      }
	      else{
	        odd++;
	      }
	    }
	    System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);


	}

}
