package com.service;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.model.Person;

public class AddressBookService implements addressbookservice
{
	Scanner scanner=new Scanner(System.in);
	HashMap<String,LinkedList<Person>> hmap = new HashMap<>();
	LinkedList<Person> linkedlist;
	
	public void serializable()
	{
		try{
		File file=new File("/home/bridgeit/Desktop/sagar/src/com/tester/addressbookdata.ser");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(hmap);
		objectOutputStream.flush();
		objectOutputStream.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void deserializable() 
	{
		try{
		
		FileInputStream fileinputStream=new FileInputStream("/home/bridgeit/Desktop/sagar/src/com/tester/addressbookdata.ser");
		ObjectInputStream objectinputStream=new ObjectInputStream(fileinputStream);
		hmap=(HashMap)objectinputStream.readObject();
		objectinputStream.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void createAddrBook() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address book you want create: ");
		 String addbookname=scanner.next();
		//conobj.addPerson();
		hmap.put(addbookname, new LinkedList<>());
		
		serializable();
		
		System.out.println("Address created Succssfully by name "+addbookname);
	}

	@Override
	public void addNewPerson() 
	{
		Person p=new Person();
		
		deserializable();
		
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address Book in which you want to add person:");
		String addressbook=scanner.next();
		if(hmap.containsKey(addressbook))
		{
			System.out.println("Enter the First name:");
			String fname=scanner.next();
			p.setFirstname(fname);
		
			System.out.println("Enter the Last name:");
			String lname=scanner.next();
			p.setLastname(lname);
		
			System.out.println("Enter the address:");
			String address=scanner.next();
			p.setAddress(address);
		
			System.out.println("Enter the City:");
			String city=scanner.next();
			p.setCity(city);
		
			System.out.println("Enter the State:");
			String  state=scanner.next();
			p.setState(state);
		
			System.out.println("Enter the Mobile number:");
			Long mobno=scanner.nextLong();
			p.setMobno(mobno);
		
			System.out.println("Enter the Zipcode:");
			int zipcode=scanner.nextInt();
			p.setZipcode(zipcode);
		
			LinkedList<Person> list=hmap.get(addressbook);
			list.add(p);
			hmap.put(addressbook,list);
			System.out.println("Person added Succssfully");
			System.out.println(list.toString());
		}
		else
		{
			System.out.println("Address Book does not Exist");
			return;
		}
		
		serializable();
	}

	@Override
	public void deletePerson() 
	{ 
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address Book:");
		String addressbook=scanner.next();
		
		deserializable();
		
		LinkedList<Person> list=hmap.get(addressbook);
		
		int flag=1;
	
		if(hmap.containsKey(addressbook))
		{
			if(list.isEmpty())
			{
				System.out.println("Address Book is Empty");
				return;
			}
			
			System.out.println("Enter the Mobile number of the Person:");
			long mobileno=scanner.nextLong();
			
			for(int i=0;i<list.size();i++)
			{
				long value=hmap.get(addressbook).get(i).getMobno();
				if(mobileno==value)
				{
					list.remove(hmap.get(addressbook).get(i));
					System.out.println("Person is Deleted");
					flag=0;
					serializable();
					return;
				}
			
			}
			if(flag==1)
			{
				System.out.println("Mobile Number does not Exist");
			}
		}
		else
		{
			System.out.println("Address book does not Exist");
		}
		
		
			
	}

	@Override
	public void searchPerson() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address Book:");
		String addressbook=scanner.next();
		System.out.println("Enter the Mobile number of the Person:");
		long mobileno=scanner.nextLong();
		
		deserializable();
		
		LinkedList<Person> list=hmap.get(addressbook);
		
		int flag=1;
		for(int i=0;i<list.size();i++)
		{
			long value=hmap.get(addressbook).get(i).getMobno();
			if(mobileno==value)
			{
				
				System.out.println("Persons info is:");
				System.out.println(hmap.get(addressbook).get(i));
				flag=0;
				return;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Person does not Exist");
		}
	}

	@Override
	public void sortByLastName()
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address Book:");
		String addressbook=scanner.next();
		
		deserializable();
		
		LinkedList<Person> list=hmap.get(addressbook);
		
		/*String[] lastname=new String[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			lastname[i]=hmap.get(addressbook).get(i).getLastname();
			
		}
		Arrays.sort(lastname);
		for(int i=0;i<lastname.length;i++)
		{
			System.out.println(lastname[i]);
		}
		
		System.out.println("Address Book sorted by last name");
		for(int i=0;i<lastname.length;i++)
		{
			for(int j=0;j<lastname.length;j++)
			{
				String lname=hmap.get(addressbook).get(j).getLastname();
				if(lastname[i].equals(lname))
				{
					System.out.println(list.get(j));
				}
			}
		}*/
		Collections.sort(list, Person.comparelastname);
		System.out.println(list);
		
	}
	
	public void editPerson()
	{
		System.out.println("Enter the name of Address Book:");
		String addressbook=scanner.next();
		
		System.out.println("Enter the mobile number of person:");
		long mobileno=scanner.nextLong();
		
		deserializable();
		
		LinkedList<Person> list=hmap.get(addressbook);
		int flag=1;
		Person person=new Person();
		
		for(int i=0;i<list.size();i++)
		{
			long value=hmap.get(addressbook).get(i).getMobno();
			if(mobileno==value)
			{
				person=hmap.get(addressbook).get(i);
				
				flag=0;
				
			}
			
		}
		if(flag==1)
		{
			System.out.println("Mobile Number does not Exist");
		}
		char response;
		do
		{
			System.out.println("1.Edit First name:");
			System.out.println("2.Edit Last name:");
			System.out.println("3.Edit Address");
			System.out.println("4.Edit City:");
			System.out.println("5.Edit State:");
			System.out.println("6.Edit Mobile Number:");
			System.out.println("7.Edit Zip Code:");
			System.out.println("8.Exit:");
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter new First name:");
					String newfirstname=scanner.next();
					person.setFirstname(newfirstname);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 2:System.out.println("Enter new Last name:");
					String newlastname=scanner.next();
					person.setLastname(newlastname);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 3:System.out.println("Enter new Address:");
					String newadress=scanner.next();
					person.setAddress(newadress);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 4:System.out.println("Enter new City:");
					String newcity=scanner.next();
					person.setCity(newcity);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 5:System.out.println("Enter new State:");
					String newstate=scanner.next();
					person.setState(newstate);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 6:System.out.println("Enter new Mobile Number:");
					long newmobileno=scanner.nextLong();
					person.setMobno(newmobileno);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 7:System.out.println("Enter new Zipcode:");
					int newzipcode=scanner.nextInt();
					person.setZipcode(newzipcode);
					System.out.println("Person informaton is Edited");
					System.out.println(person.toString());
					break;
			case 8:System.exit(0);
	
			}
			System.out.println("Do you want to Edit any other information(y:yes or n:no):");
			response=scanner.next().charAt(0);
		}while(response=='y' || response=='Y');
		
		serializable();
	}

	@Override
	public void sortByZipCode() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the name of Address Book:");
		String addressbook=scanner.next();
		
		deserializable();
		
		LinkedList<Person> list=hmap.get(addressbook);
		
/*		int[] zipcode=new int[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			zipcode[i]=hmap.get(addressbook).get(i).getZipcode();
			
		}
		
	//	int zip[];
		int size=zipcode.length;
		for(int i=0;i<zipcode.length;i++)
		{
			for(int j=i+1;j<zipcode.length;j++)
			{
				if (zipcode[i] == zipcode[j]) // checking one element with all the
					// element
				{
					while (j < (zipcode.length) - 1) 
					{
					    zipcode[j] = zipcode[j + 1];// shifting the values
					    j++;
					}   
					(size)--;
				}
			}
			
		}
		
		Arrays.sort(zipcode);
		
		System.out.println("Address Book sorted by ZipCode");
		for(int i=0;i<zipcode.length;i++)
		{
			for(int j=0;j<zipcode.length;j++)
			{
				int zip=hmap.get(addressbook).get(j).getZipcode();
				if(zipcode[i] == zip)
				{
					System.out.println(list.get(j));
					
				}
			}
		}*/
		
		Collections.sort(list, Person.comparezipcode);
		System.out.println(list);
	
	}

	@Override
	public void displayAddressBook(String addressbook) 
	{
		// TODO Auto-generated method stub
		
			deserializable();
		
		
		if(hmap.containsKey(addressbook))
		{
			System.out.println("Address Book naming "+addressbook);
			LinkedList<Person> list=hmap.get(addressbook);
			System.out.println(list);
			System.out.println("................................AddressBook................................");
			System.out.println("................................"+addressbook+"............................");
			System.out.println("FirstName\tLastName\tAddress\t\tCity\t\tState\t\tMobileNumber\t\tZipcode");
			for(int i=0;i<list.size();i++)
			{
				System.out.print("\n"+hmap.get(addressbook).get(i).getFirstname());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getLastname());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getAddress());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getCity());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getState());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getMobno());
				System.out.print("\t\t"+hmap.get(addressbook).get(i).getZipcode());
				
			}	
		}
		else
		{
			System.out.println("Address Book does not Exist");
			return;
		}
		
	}

}
 