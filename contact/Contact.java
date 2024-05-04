package com.app.contact;

import java.time.LocalDate;



public class Contact implements Comparable<Contact> {
	private String phonenumber;
	private String name;
	private LocalDate dob;
	private String email;
	
	public Contact(String phonenumber, String name, LocalDate dob, String email) 
	{
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}
	
	public int HashCode()
	{
	 return 7*name.hashCode()*dob.hashCode();	
	}
	
	public boolean equals(Object o)
	{
		
		if(o instanceof Contact)
		{
			Contact c=(Contact)o;
			return this.name.equals(c.name)&& this.dob.isEqual(c.dob);
		}
		return false;
		
	}

	@Override
	public int compareTo(Contact o) 
	{
		int res=this.name.compareTo(((Contact)o).name);
		if(res>0)
			return 1;
		else if(res<0)
			 return -1;
		else
			return 0;
	}



}
