package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility 
{
	Scanner scanner=new Scanner(System.in);
	
	//take input of integer value using Scanner class and return integer 
	public int inputNumber()
	{
		int number;
		number=scanner.nextInt();
		return number;
		
	}
	
	//Take input 1D integer type Array and return integer array
	public int[] input1DIntegerArray(int arraySize)
	{
			int array[]=new int[arraySize];
			for(int i=0;i<arraySize;i++)
			{
				//System.out.println("Enter array["+i+"] : ");
				array[i]=scanner.nextInt();
			}
			return array;
	}
		
	//Input 1D String array
	//takes size of String array in integer and returns String array
	public String[] input1DStringArray(int size)
	{
		String[] array=new String[size];
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.next();
		}
		return array;
	}
		
		
		
	//Print 1D integer array
	//take integer array as input
	public void print1DIntegerArray(int array[])
	{
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
	
	//print 1D String array
	//take String array as input
	public void print1DStringArray(String array[])
	{
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
	}
	
	//Take input for integer type 2D array for rows and columns and return integer type 2D array
	public int[][] input2DIntegerArray(int row,int col)
	{
		int array[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		return array;
	}
	
	
	//print 2D array of Integer type and return void
	public void print2DIntegerArray(int array[][])
	{
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array.length;j++)
				{
			
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
	}
	
	
	//Take input of String type string and return string 
	public String inputString()
	{
		String string=scanner.nextLine();
		return string;
	}
	
	
	
	//Bubble Sort for Integer array
	//take integer array as input and returns sorted integer array
		public int[] bubbleSortInteger(int numbers[])
	   	 {
	        int temp;
	        for(int i = 0; i < numbers.length; i++)
	       	{
	            for(int j = 1; j < (numbers.length -i); j++)
	            {
	            	
	        		if(numbers[j-1] > numbers[j])
	    			{
	    				temp = numbers[j-1];
	   					numbers[j-1]=numbers[j];
	    				numbers[j]=temp;
	    			}
	   		 	}
	    	}
			return numbers;
		}
		
	
	//Bubble sort for Stirng array
	//takes input as Stirng array and returns sorted String array
		public String[] BubbleSortString(String[] array) 
		{
			
			String temp;
			
			for(int i=0; i<array.length; i++) 
			{
				for(int j=0; j<array.length-1-i; j++) 
				{
				      if(array[j].compareTo(array[j+1])>0) 
				      {
				    	  temp = array[j];
				    	  array[j] = array[j+1];
			
				          array[j+1] = temp;
			
				      }
				 }
			
			}
			return array;
		}
		
		
		
	//Binary search for sorted integer array
	//take sorted integer array and value to be search as input and return the the searched value if found 
	//or -1 if not found
		
	public int binarySearchInteger(int[] array, int search) 
	{
	       int start = 0;
	       int end = array.length - 1;
	      
	       while (start <= end) 
	       {
	            int mid = (start + end) / 2;
	            if (search == array[mid]) {
	                return mid;
	            }
	            if (search < array[mid]) {
	               	end = mid - 1;
	            } else {
	               	start = mid + 1;
	            }
	       }
	       return -1;
	}
	
	
	
	//Binary Search for String array
	//takes input as String array and returns the postion of search word or -1 if not found
	public int binarySearchString(String[] names, String key) 
	{
	    	int first = 0;
	    	int last  = names.length-1;
	 
	    	while (first <= last) 
	    	{
	        	int mid = (first + last) / 2;
	        	if (key.compareTo(names[mid]) < 0) 
	        	{
	           			last = mid-1;
	        	} 
	        	else if (key.compareTo(names[mid]) > 0) 
	        	{
	            		first = mid + 1;
	        	} 
	        	else 
	        	{
	            		return mid;
	        	}
	    	}		
	    	return -1;
	}
	
	
	
	//Insertion sort for integers
	//takes integer array as input and returns sorted integer array
	
	public int[] insertionSortInteger(int array[])
	{
		int temp;
		for(int i=1;i<array.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if((array[j]-array[j-1])<0)
				{
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				else
					break;
			}
		}
		return array;
	}

	
	//Insertion sort for String
	//takes String array as input and returns sorted String array
	
	public String[] insertionSortString(String words[])
	{
		String temp;
		for(int i=1;i<words.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(words[j].compareTo(words[j-1])<0)
				{
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}


	public String[] readFile(File file) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));

		int content;
		String string=null;
		String[] strarray=null;
		while((string=br.readLine())!=null)
		{
			strarray=string.split(" ");
		}
		
		return strarray;
	}

	

}








