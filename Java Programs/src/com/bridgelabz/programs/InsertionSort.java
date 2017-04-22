package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of String array:");
		int size=scanner.nextInt();

		System.out.println("Enter the elements of Integer array of size "+size);
		String[] strarray=utility.input1DStringArray(size); 

		String[] sortedstringarray=utility.insertionSortString(strarray);
		
		System.out.println("The sorted String array is:");
		utility.print1DStringArray(sortedstringarray);
		

	}

}