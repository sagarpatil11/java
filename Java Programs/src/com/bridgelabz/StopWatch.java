package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int start,stop;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1 to start the stopwatch:");
		start=s.nextInt();
		
		int starttime=(int) System.currentTimeMillis();
		
		System.out.println("Enter 2 to stop the stopwatch:");
		stop=s.nextInt();
		
		int stoptime=(int) System.currentTimeMillis();
		
		int elapsetime=stoptime-starttime;
		
		System.out.println("Elapsed Time in mili seconds is "+elapsetime);
		System.out.println("Elapsed Time in seconds is "+elapsetime/1000);
	}

}
