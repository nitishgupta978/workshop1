package com.bridgelabz.gambler;

public class UC1 {
public static void main(String[] args) {
	byte gambler=1;
	byte stake =100;
	byte bet=1;
	byte wine=0;
	byte stakeof=0;
	double start= Math.floor(Math.random()%2)*2;
	if (start==gambler) {
		bet=1;
	stakeof=(byte) (wine+stake);
			System.out.println("win");
		
	}
	else {
		bet=stakeof;
		stakeof=0;
		System.out.println("loss");
	
	
	}
}
}
