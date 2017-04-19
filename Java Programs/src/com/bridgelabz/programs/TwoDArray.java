package com.bridgelabz.programs;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
		
		Scanner scanner=new Scanner(System.in);
		int M,N;
		System.out.println("Enter the number of M rows and N columns: ");
		M=scanner.nextInt();
		N=scanner.nextInt();
		int array[][];
		
		System.out.println("Enter the M*N inputs for 2D array:");
		
		array=utility.input2DIntegerArray(M, N);
		
		
		System.out.println("Array elements are:");
		
		utility.print2DIntegerArray(array);
		
		PrintWriter printwriter=new PrintWriter(System.out);
		System.out.println("Array elements using PrintWriter are");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				printwriter.print(array[i][j]+" ");
			}
			printwriter.println();
		}
		printwriter.flush();

	}

}
