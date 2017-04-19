package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sumof3Numbers 
{
	
	public void distinctTriplets(int[] arr,int size)
	{
		int count=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println("Number of Distinct triplets are:"+count);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of array:");
		size=scanner.nextInt();
		
		int array[];
		
		System.out.println("Enter the 1D array elements:");
		array=utility.input1DIntegerArray(size);
		
		Sumof3Numbers o=new Sumof3Numbers();
		o.distinctTriplets(array,size);
		
	}

}
