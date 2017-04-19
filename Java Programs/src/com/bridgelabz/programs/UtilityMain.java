package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UtilityMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		while(true)
		{	
		int choice;
		int size;
		int intarray[],sortedintarray[];
		String strarray[],sortedstringarray[];
		int start,stop;
		int search,position;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("...........Menu..............");
		System.out.println("1.Binary Search for Integer");
		System.out.println("2.Binary Search for String");
		System.out.println("3.Bubble sort for Integer");
		System.out.println("4.Bubble sort for String");
		System.out.println("5.Insertion sort for integer");
		System.out.println("6.Insertion sort for String");
		System.out.println("7.Exit");
		
		System.out.println("Enter your choice");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the size of integer array:");
				 size=scanner.nextInt();
				
				System.out.println("Enter the elements of Integer array of size "+size);
				intarray=utility.input1DIntegerArray(size);
				
				System.out.println("Enter the element you want to search:");
				search=scanner.nextInt();
				
				Arrays.sort(intarray);
				
				start=(int)System.currentTimeMillis();
				position=utility.binarySearchInteger(intarray, search);
				stop=(int)System.currentTimeMillis();
				if(position > -1)
				{
					System.out.println("The Element "+search+" is found.");
				}
				else
				{
					System.out.println("Element is not found");
				}
				System.out.println("Elapsed time for Binary Search for Integer array is "+(stop-start/1000)+" seconds");
				break;
				
		case 2:System.out.println("Enter the size of String array:");
				size=scanner.nextInt();
		
				System.out.println("Enter the elements of String array of size "+size);
			    strarray=utility.input1DStringArray(size); 
			    
			    System.out.println("Enter the element you want to search:");
				String word=scanner.next();
				
				Arrays.sort(strarray);
				
				start=(int)System.currentTimeMillis();
				position=utility.binarySearchString(strarray, word);
				stop=(int)System.currentTimeMillis();
				if(position > -1)
				{
					System.out.println("The Word "+word+" is found.");
				}
				else
				{
					System.out.println("Element is not found");
				}
				System.out.println("Elapsed time for Binary Search for Integer array is "+(stop-start/1000)+" seconds");
				break;
				
		case 3:System.out.println("Enter the size of integer array:");
		 		size=scanner.nextInt();
			
		 		System.out.println("Enter the elements of Integer array of size "+size);
		 		intarray=utility.input1DIntegerArray(size);
		
		 		start=(int)System.currentTimeMillis();
		 		sortedintarray=utility.bubbleSortInteger(intarray);
		 		stop=(int)System.currentTimeMillis();
		 		utility.print1DIntegerArray(sortedintarray);
		 		
		 		System.out.println("Elapsed time for Bubble sort for Integer array is "+(stop-start/1000)+" seconds");
		 		break;
		
		case 4:System.out.println("Enter the size of String array:");
				size=scanner.nextInt();
		
				System.out.println("Enter the elements of Integer array of size "+size);
				strarray=utility.input1DStringArray(size); 
	    
		
				start=(int)System.currentTimeMillis();
				sortedstringarray=utility.BubbleSortString(strarray);
				stop=(int)System.currentTimeMillis();
				
				utility.print1DStringArray(sortedstringarray);
				System.out.println("Elapsed time for Bubble sort for String array is "+(stop-start/1000)+" seconds");
				break;
				
		case 5:System.out.println("Enter the size of integer array:");
				size=scanner.nextInt();
		
				System.out.println("Enter the elements of Integer array of size "+size);
				intarray=utility.input1DIntegerArray(size);

				start=(int)System.currentTimeMillis();
				sortedintarray=utility.insertionSortInteger(intarray);
				stop=(int)System.currentTimeMillis();
				utility.print1DIntegerArray(sortedintarray);
 		
				System.out.println("Elapsed time for Insertion sort for Integer array is "+(stop-start/1000)+" seconds");
				break;

		case 6:System.out.println("Enter the size of String array:");
				size=scanner.nextInt();
		
				System.out.println("Enter the elements of Integer array of size "+size);
				strarray=utility.input1DStringArray(size); 


				start=(int)System.currentTimeMillis();
				sortedstringarray=utility.insertionSortString(strarray);
				stop=(int)System.currentTimeMillis();
		
				utility.print1DStringArray(sortedstringarray);
				System.out.println("Elapsed time for Bubble sort for String array is "+(stop-start/1000)+" seconds");
				break;

		case 7:System.exit(0);
		}
		}
	}
}

