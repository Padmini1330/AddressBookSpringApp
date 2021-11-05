package com.bridgelabz.model;

import com.bridgelabz.dto.ContactDTO;

public class ContactData 
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

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getContactId() 
	{
		return contactId;
	}

	public void setContactId(int contactId) 
	{
		this.contactId = contactId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getZipCode() 
	{
		return zipCode;
	}

	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() 
	{
		return "ContactData [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", email=" + email + "]";
	}
}