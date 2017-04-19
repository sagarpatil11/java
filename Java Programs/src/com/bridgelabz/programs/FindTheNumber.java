package com.bridgelabz.programs;

import java.util.Scanner;

public class FindTheNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		N=scanner.nextInt();
		System.out.println("Remember any number between 0 to "+(N-1)+" in your mind");
		int first=0,last=N-1;
		int mid=first+last/2;
		int ans1,ans2,ans3;
		while(first<=last)
		{
			System.out.println("Is your number is "+mid+".Enter 1 for Yes and 2 for No");
			ans1=scanner.nextInt();
			if(ans1==1)
			{
				System.out.println("Your number is "+mid);
				break;
			}
			
			System.out.println("Is your number before "+mid+" then press 1 or if after then press 2:");
			ans2=scanner.nextInt();
				if(ans2==1)
				{
					last=mid-1;
				}
				else
				{
					first=mid+1;
				}
			mid=first+last/2;
		}
	}

}
