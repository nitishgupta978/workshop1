package com.bridgelabz.gambler;
import java.util.Random;
public class GamblerSimualtion {
	public static void main(String[] args) {
		
	

		int amount=100;
		int loss=0;
		int bet = 1;
	      
		while(amount>0 && amount<=100)
		{
			 int won=0;
			Random random = new Random();
			int check=random.nextInt(1);
			
			if(check==0)
			{
				amount=amount+bet;
				won=won+1;
				
		}
			else
			{
				amount=amount-bet;
				loss=loss+1;
				}
			}
		 	
		if(amount>100)
		{
			System.out.println("won");
		}
		else
		{
			System.out.println("loss");
		}
}
}

