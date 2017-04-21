package com.controller;

import com.service.AddressBookService;

public class AddressBookController
{


	AddressBookService service=new AddressBookService();
	public void createAddressBook() 
	{
		// TODO Auto-generated method stub
	
		service.createAddrBook();
		
	}

	public void addPerson() 
	{
		// TODO Auto-generated method stub
		service.addNewPerson();
	}
	
	public void deletePerson()
	{
		service.deletePerson();
	}
	
	public void searchPerson()
	{
		service.searchPerson();
	}
	
	public void editPerson()
	{
		service.editPerson();
	}
	
	public void sortByLastName()
	{
		service.sortByLastName();
	}
	
	public void sortByZipCode()
	{
		service.sortByZipCode();
	}
	
	public void displayAddressBook(String addressbook)
	{
		service.displayAddressBook(addressbook);
	}

}
