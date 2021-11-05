package com.bridgelabz.dto;

public class ContactDTO 
{
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String city;
	public String state;
	public String zipCode;
	public String email;

	public ContactDTO(String firstName, String lastName, String phoneNumber, String city, String state, String zipCode,
			String email) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "ContactDTO [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", email=" + email + "]";
	}

}