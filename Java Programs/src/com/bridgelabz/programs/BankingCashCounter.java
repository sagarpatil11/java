package com.bridgelabz.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankingCashCounter 
{
	Queue queue=new LinkedList<>();
	Scanner scanner=new Scanner(System.in);
	Account account;
	int balance=0;
	
	public void deposit()
	{

		System.out.println("Enter the account number:");
		long accountno=scanner.nextLong();

		System.out.println("Enter the name of account holder:");
		String name=scanner.next();
		
		System.out.println("Enter the amount to Deposited:");
		int deposit=scanner.nextInt();
		account=new Account(accountno, name, deposit);
		queue.add(account);
		balance=balance+deposit;
	}

	public void withdraw()
	{

		System.out.println("Enter the account number:");
		long accountno=scanner.nextLong();

		System.out.println("Enter the name of account holder:");
		String name=scanner.next();
		
		System.out.println("Enter the amount to Withdraw:");
		int withdraw=scanner.nextInt();
		account=new Account(accountno, name, withdraw);
		queue.add(account);
		
		if(balance < withdraw)
		{
			System.out.println("Balance is Low");
		}
		else
		{
			balance=balance-withdraw;
		}
	}
	
	public void removeFromQueue()
	{
		if(queue.isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			queue.remove();
		}
	}

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankingCashCounter bankingcashcounter=new BankingCashCounter();
		Scanner scanner =new Scanner(System.in);
		while(true)
		{
			System.out.println(".......MENU...........");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Remove");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:bankingcashcounter.deposit();
					break;
			case 2:bankingcashcounter.withdraw();
					break;
			case 3:bankingcashcounter.removeFromQueue();
					break;
			case 4:System.exit(0);
			}
		}	
	}

}
