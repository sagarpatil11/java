package com.tester;

import java.util.Scanner;

import com.controller.AddressBookController;

public class AddressBookMain 
{
	
	public static void main(String[] args) 
	{
		AddressBookController addressbookcontroller=new AddressBookController();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n\n\n.......MENU.........");
			System.out.println("1.Create Address Book");
			System.out.println("2.Add Person");
			System.out.println("3.Delete Person");
			System.out.println("4.Search Person");
			System.out.println("5.Edit Person");
			System.out.println("6.Sort by Last Name");
			System.out.println("7.Sort by ZipCode");
			System.out.println("8.Display Address Book");
			System.out.println("9.Exit");
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
		
			switch(choice)
			{
			case 1:
					addressbookcontroller.createAddressBook();
					break;
			case 2:
					addressbookcontroller.addPerson();
					break;
			case 3:
					addressbookcontroller.deletePerson();
					break;
			case 4:
					addressbookcontroller.searchPerson();
					break;
			case 5:
					addressbookcontroller.editPerson();
					break;
			case 6:
					addressbookcontroller.sortByLastName();
					break;
			case 7:
					addressbookcontroller.sortByZipCode();
					break;
			case 8:
					System.out.println("Enter the Address Book name you want to display:");
					String addressbook=scanner.next();
					addressbookcontroller.displayAddressBook(addressbook);
					break;
			case 9:System.exit(0);
			}
		}	
	}

}
