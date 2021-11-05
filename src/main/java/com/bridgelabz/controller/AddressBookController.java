package com.bridgelabz.controller;

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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController 
{
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<String> getAddressBookData()
	{
		return new ResponseEntity<String>("Get Call Successfull!", HttpStatus.OK);
	}
	
	@GetMapping("/get/{firstName}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("firstName") String firstName)
	{
		return new ResponseEntity<String>("Get Call Successfull!: " + firstName, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(
				@RequestBody ContactDTO contactDTO)
	{
		return new ResponseEntity<String>("Created AddressBook Data for: "+ contactDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(
			@RequestBody ContactDTO contactDTO)
	{
		return new ResponseEntity<String>("Updated AddressBook Data for: "+ contactDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{firstName}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("firstName") String firstName)
	{
		return new ResponseEntity<String>("Delete Call Successful: " + firstName, HttpStatus.OK);
	}

}