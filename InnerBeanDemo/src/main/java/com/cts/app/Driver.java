package com.cts.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static AddressBook loadAddressBook()
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook ab= (AddressBook) context.getBean("addressBook");
		return ab;
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values

		AddressBook obj;
		obj=loadAddressBook();
		String city;
		Scanner scanner = new Scanner(System.in);
		city = scanner.next();
		
		obj.getAddress().setCity(city);
		System.out.println("Phone Number = "+obj.getPhoneNumber()+"\n Address= "+obj.getAddress().getHouseName()+"\n Strret = "+obj.getAddress().getStreet()+"\n City = "+obj.getAddress().getCity()+"\n State = "+obj.getAddress().getState());
	}


}
