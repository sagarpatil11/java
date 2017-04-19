package com.bridgelabz.programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year in format yyyy");
		year=scanner.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0)
		{


			System.out.println(year+" is a Leap year");
		}
		else
		{
			System.out.println(year+" is not a Leap year");
	
		}
	}

}
