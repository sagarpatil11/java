package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.Iterator;

public class UnorderedList {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		FileInputStream fileinputstream;
		File file=new File("/home/bridgeit/workspace/Java Programs/src/com/bridgelabz/programs/file1.txt");
		fileinputstream=new FileInputStream(file);
		
		int content;
		String string="";
		while((content=fileinputstream.read())!=-1)
		{
			string=string+(char)content;
		}
		
		String[] strarray=string.split("\\s");
		
		LinkedList<String> list=new LinkedList<>();
		
		for(int i=0;i<strarray.length;i++)
		{
			list.add(strarray[i]);
		}
		
		System.out.println("Enter the word you want to search");
		String word=scanner.next();
		
		FileWriter filewriter=new FileWriter(file);
		
		if((list.contains(word)))
		{
			System.out.println("Word found");
			list.remove(word);
			for(int i=0;i<list.size();i++)
			{
				filewriter.write(list.get(i)+" ");
				filewriter.flush();
			}
			
		}
		else
		{
			System.out.println("Word not found");
			list.add(word);
			for(int i=0;i<list.size();i++)
			{
				filewriter.write(list.get(i)+" ");
				filewriter.flush();
			}
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
