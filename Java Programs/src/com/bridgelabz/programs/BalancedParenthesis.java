package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack stack=new Stack();	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any arithmatic expression:");
		String expression=scanner.nextLine();
		
		for(int i=0;i<expression.length();i++)
		{
			char c=expression.charAt(i);
			
			if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				if(stack.isEmpty())
				{
					System.out.println("Parenthesis is not Balanced");
					return;
				}
				else
				{
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("Parenthesis is Balenced");
		}
		else
		{
			System.out.println("Parenthesis is not Balenced");
		}
		
		
	}

}
