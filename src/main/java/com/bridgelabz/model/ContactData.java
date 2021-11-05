package com.bridgelabz.model;

import com.bridgelabz.dto.ContactDTO;

import lombok.Data;

public @Data class ContactData 
{
	private int contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String city;
	private String state;
	private String zipCode;
	private String email;

	public ContactData() 
	{
	}

	public ContactData(int contactId, ContactDTO contactDTO) 
	{
		this.contactId = contactId;
		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.phoneNumber = contactDTO.phoneNumber;
		this.city = contactDTO.city;
		this.state = contactDTO.state;
		this.zipCode = contactDTO.zipCode;
		this.email = contactDTO.email;
	}
}