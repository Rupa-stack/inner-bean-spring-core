package com.cts.app;

public class AddressBook {
	private String phoneNumber;
	private Address address;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public AddressBook() {
		
	}
	public AddressBook(String phoneNumber, Address address) {
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public AddressBook(Address address) {
		//this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
}
