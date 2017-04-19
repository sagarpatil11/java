package com.bridgelabz.programs;

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int flip;
			int head=0,tail=0;
			double ptail,phead,rno;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number of times you want to flip coin:");
			flip=scanner.nextInt();
			
			for(int i=0;i<flip;i++)
			{
				rno=Math.random();
				if(rno < 0.5)
				{
					tail++;
				}
				else
				{
					head++;
				}
			}
			System.out.println("tails:"+tail);
			System.out.println("heads:"+head);			
			ptail=(double)tail/flip*100;
			phead=(double)head/flip*100;
			System.out.println("Percentage of Tails is "+ptail+" vs percentage of Heads is "+phead);		
		

	}

}
