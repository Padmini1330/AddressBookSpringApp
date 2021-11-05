package com.bridgelabz.dto;

import lombok.Data;

public @Data class ContactDTO 
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
}