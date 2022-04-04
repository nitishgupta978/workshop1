package com.bridgelabz.gambler;


import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake=100;
		int goal=0;
		int bet = 1;
		int win=0;
		int numOfPlay;
		
		Scanner scanner= new Scanner(System.in);
		stake=scanner.nextInt();

		for(int i=0;i<bet;i++)
	{
		int cash=stake;
		int star=0;
		while(cash>0 && cash<goal)
		{
			bet++;
			
		if(Math.random()<1)
		{
			cash++;
			
			while(star<=cash)
			{
				star++;
				
				System.out.println("win");
			}
		}
			else
			{
				cash--;
				
				while(star <= cash)
				{
					star--;
					System.out.println("*");
				}
			}
		System.out.println("enyer the number ");
		}
		if(cash==goal)
		{
			win++;
		}
		
		System.out.println( win);
		}
		
	}
}
	



