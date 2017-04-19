package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stock 
{
	public void stockPortfolio(String sname,int noofshare,int sprice)
	{
		int totalprice=noofshare*sprice;
		
		System.out.println("Stock Report");
		System.out.println("Share Name:"+sname);
		System.out.println("Number of Stock:"+noofshare);
		System.out.println("Price per Share:"+sprice);
		System.out.println("Share total Price:"+totalprice);
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String sname;
		int noofshare,sprice;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Share name:");
		sname=s.next();
		System.out.println("Enter the Number of Shares:");
		noofshare=s.nextInt();
		System.out.println("Enter the price of share:");
		sprice=s.nextInt();
		
		Stock st=new Stock();
		st.stockPortfolio(sname,noofshare,sprice);
	}

}
