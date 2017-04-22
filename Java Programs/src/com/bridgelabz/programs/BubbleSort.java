package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of integer array:");
 		int size=scanner.nextInt();
	
 		System.out.println("Enter the elements of Integer array of size "+size);
 		int[] intarray=utility.input1DIntegerArray(size);

 		int[] sortedintarray=utility.bubbleSortInteger(intarray);
 		System.out.println("The Sorted Integer Array is:");
 		utility.print1DIntegerArray(sortedintarray);

	}

}