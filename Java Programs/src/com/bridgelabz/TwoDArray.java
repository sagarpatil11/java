package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int M,N;
		System.out.println("Enter the number of M rows and N columns: ");
		M=s.nextInt();
		N=s.nextInt();
		int array[][]=new int[M][N];
				

		System.out.println("Enter the M*N inputs for 2D array:");
		

		/*for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				array[i][j]=s.nextInt();
				
			}
		//	System.out.println();
		}*/
		System.out.println("Array elements are:");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		PrintWriter pw=new PrintWriter(System.out);
		System.out.println("Array elements using PrintWriter are");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				pw.print(array[i][j]+" ");
			}
			pw.println();
		}
		pw.flush();
	}
}
