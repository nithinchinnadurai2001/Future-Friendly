package com.chainsys.assignment1;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Team A : ");
		String teamA = sc.next();
		System.out.println("Enter Your Team B : ");
		String teamB = sc.next();
		System.out.println("Enter Your Team A Score : ");
		int scoreA = sc.nextInt();
		System.out.println("Enter Your Team B Score : ");
		int scoreB = sc.nextInt();
		
		if(scoreA > scoreB)
		{
			System.out.println("Team A is Won the Match");
		}
		else if(scoreA < scoreB)
		{
			System.out.println("Team B is Won the Match");
		}
		else
		{
			System.out.println("Match Draw");
		}

	}

}
