package com.service;

import java.io.IOException;

public interface addressbookservice 
{
	public void createAddrBook();
	public void addNewPerson();
	public void deletePerson();
	public void searchPerson();
	public void sortByLastName();
	public void sortByZipCode();
	public void editPerson();
	public void displayAddressBook(String addressbook);
	
}
