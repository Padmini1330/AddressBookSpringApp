package com.bridgelabz.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;


public @Data class ContactDTO 
{
	@NotNull
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "FirstName is Invalid!")
	public String firstName;

	@NotNull
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "LastName is Invalid!")
	public String lastName;

	@NotNull
	@Pattern(regexp = "^[+]?([0-9]{2})?[789]{1}[0-9]{9}$", message = "PhoneNumber Invalid")
	public String phoneNumber;

	@NotNull
	public String city;

	@NotNull
	public String state;

	@NotNull
	@Pattern(regexp = "^[0-9]{3}\\s?[0-9]{3}$", message = "ZipCode is Invalid!")
	public String zipCode;

	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9]+[_+.-]?[a-zA-Z0-9]*[@][A-Za-z]+[.][a-zA-Z]*[.]?[a-zA-Z]+$", message = "Email is Invalid!")
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