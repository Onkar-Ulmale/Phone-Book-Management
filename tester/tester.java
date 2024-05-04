package com.app.tester;

import java.time.LocalDate;
import java.util.*;

import com.app.contact.Contact;

public class tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			@SuppressWarnings("unused")
			Set<Contact> contactList = new HashSet<>();
			// phonenumber, name, dob,  email
			Contact c1=new Contact("1111111111","Tiger",LocalDate.of(1997,06,11),"tiger12@gmail.com");
			Contact c2=new Contact("2222222222","Lion",LocalDate.of(1997,06,11),"tiger12@gmail.com");
			Contact c3=new Contact("3333333333","Monkey",LocalDate.of(1997,06,11),"tiger12@gmail.com");
			Contact c4=new Contact("4444444444","Horse",LocalDate.of(1997,06,11),"tiger12@gmail.com");
			Contact c5=new Contact("5555555555","Dog",LocalDate.of(1997,06,11),"tiger12@gmail.com");
			contactList.add(c1);
			contactList.add(c2);
			contactList.add(c3);
			contactList.add(c4);
			contactList.add(c5);
			while(!exit) 
			{
				System.out.println("Options:: \n 1. Add Contact \n 2. Show All Contacts \n 3. Sort by Name \n 0. Exit --- CHOOSE ---");
				
				try
				{
					switch (sc.nextInt())
					{
					    case 1:
					    	System.out.println("Enter The details :: Phone Number , Name ,Date Of Birth , Email ID");
					    	String phno=sc.next();
					    	String nme=sc.next();
					    	String dob=sc.next();
					    	String email=sc.next();
					    	LocalDate birthdate = LocalDate.parse(dob);
					    	Contact contact=new Contact(phno,nme,birthdate,email);
					    	contactList.add(contact);
					    	System.out.println("Contact Added ");
						break;
					    case 2:
					    	for (Contact c:contactList) 
					    	{
					    		System.out.println(c); 
					    	}
					    	break;
					    case 3://Sort by Name
					    		
					    	break;
					    case 0:
					    	exit=true;
					    	break;	
					}
				}catch(Exception e)
				{
					System.out.println(e);	
				}		
			}		
		}
	}

}
