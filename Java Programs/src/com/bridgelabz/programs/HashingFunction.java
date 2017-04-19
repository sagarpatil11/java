package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HashingFunction 
{
	
	
	
	
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		
		LinkedList<Integer>[] list=new LinkedList[11];
		
		HashMap<Integer,LinkedList<Integer>> hmap=new HashMap<>();
		
		Scanner scanner=new Scanner(System.in);
		
		File file=new File("/home/bridgeit/workspace/Java Programs/src/com/bridgelabz/programs/hash.txt");
	
		/*	FileInputStream fileinputstream=new FileInputStream(file);
		*/
		
		String[] strarray=utility.readFile(file);
		
		
		int[] intarray=new int[strarray.length];
		for(int i=0;i<intarray.length;i++)
		{
			intarray[i]=Integer.parseInt(strarray[i]);
		}
		
		for(int i=0;i<intarray.length;i++)
			System.out.print(intarray[i]+" ");
		
		for(int i=0;i<11;i++)
		{
			list[i]=new LinkedList<>();
			hmap.put(i, list[i]);
		}
	//	System.out.println("go");
		for(int i=0;i<intarray.length;i++)
		{
			int position=intarray[i]%11;
			//System.out.println(position);
			list[position].add(intarray[i]);
			Collections.sort(list[position]);
			//System.out.println(list[position]);
			hmap.put(position, list[position]);
		
		}
			
		System.out.println("/nEnter the number you want to search:");
		int search=scanner.nextInt();
	
			int position=search%11;
			
			System.out.println("hi");
			
		    	if(list[position].contains(search))
		    	{
		    		list[position].removeFirstOccurrence(search);
		    	}
		    	else
		    	{
		    		list[position].add(search);
		    		Collections.sort(list[position]);
		    	}
		    
		
		
	//	System.out.println("hi");
		
			System.out.println(hmap);
	
		

	}

}
