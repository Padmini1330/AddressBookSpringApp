package com.bridgelabz.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.dto.ContactDTO;
import com.bridgelabz.dto.ResponseDTO;
import com.bridgelabz.model.ContactData;
import com.bridgelabz.service.AddressBookService;

import javax.validation.Valid;

@RestController
public class AddressBookController 
{
	@Autowired
	AddressBookService addressBookService;

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getContactData() 
	{
		List<ContactData> contactList = addressBookService.getContact();
		ResponseDTO response = new ResponseDTO("Get Call Successfull!", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getContactDataById(@PathVariable int contactId) 
	{
		ContactData contactData = addressBookService.getContactById(contactId);
		ResponseDTO response = new ResponseDTO("Get Call By ID Successfull!", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@GetMapping("/city/{city}")
	public ResponseEntity<ResponseDTO> getContactByCity(@PathVariable String city) 
	{
		List<ContactData> contactList = addressBookService.getContactbyCity(city);
		ResponseDTO response = new ResponseDTO("successfully found contacts by city!", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	
	@GetMapping("/state/{state}")
	public ResponseEntity<ResponseDTO> getContactByState(@PathVariable String state) 
	{
		List<ContactData> contactList = addressBookService.getContactbyState(state);
		ResponseDTO response = new ResponseDTO("successfully found contacts by state!", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	
	@GetMapping("/zipcode/{zipCode}")
	public ResponseEntity<ResponseDTO> getContactByZipCode(@PathVariable String zipCode) 
	{
		List<ContactData> contactList = addressBookService.getContactbyZipCode(zipCode);
		ResponseDTO response = new ResponseDTO("successfully found contacts by zipcode!", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createContactData(@Valid @RequestBody ContactDTO contactDTO) 
	{
		ContactData contactData = addressBookService.createContact(contactDTO);
		ResponseDTO response = new ResponseDTO("Contact Added Successfully! ", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateContactData(@PathVariable int contactId,
			@Valid @RequestBody ContactDTO contactDTO) 
	{
		ContactData contactData = addressBookService.updateContact(contactId, contactDTO);
		ResponseDTO response = new ResponseDTO("Contact Updated! ", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteContactData(@PathVariable int contactId) 
	{
		addressBookService.deleteContact(contactId);
		return new ResponseEntity<String>("Deleted Contact = " + contactId, HttpStatus.OK);
	}

}