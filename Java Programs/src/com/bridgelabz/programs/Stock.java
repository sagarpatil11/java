package com.bridgelabz.programs;

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
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String sname;
		int noofshare,sprice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Share name:");
		sname=scanner.next();
		System.out.println("Enter the Number of Shares:");
		noofshare=scanner.nextInt();
		System.out.println("Enter the price of share:");
		sprice=scanner.nextInt();
		
		Stock st=new Stock();
		st.stockPortfolio(sname,noofshare,sprice);
	}

}
