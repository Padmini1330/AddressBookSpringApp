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
import com.bridgelabz.dto.ResponseDTO;
import com.bridgelabz.model.ContactData;

@RestController
public class AddressBookController 
{
	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() 
	{
		ContactData contactData = new ContactData(1,
				new ContactDTO("Padmini", "Sharma", "9999999999", "Bangalore", "Karnataka", "560108", "padmini@gmail.com"));
		ResponseDTO response = new ResponseDTO("Get Call Successful!", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable int contactId) 
	{
		ContactData contactData = new ContactData(1,
				new ContactDTO("Padmini", "Sharma", "9999999999", "Bangalore", "Karnataka", "560108", "padminii@gmail.com"));
		ResponseDTO response = new ResponseDTO("Get Call Successful!", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody ContactDTO contactDTO) 
	{
		ContactData contactData = new ContactData(1, contactDTO);
		ResponseDTO response = new ResponseDTO("New Contact Added ", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable int contactId,
			@RequestBody ContactDTO contactDTO) 
	{
		ContactData contactData = new ContactData(contactId, contactDTO);
		ResponseDTO response = new ResponseDTO("Existing Contact Updated ", contactData);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable long contactId) 
	{
		return new ResponseEntity<String>("Deleted employee = " + contactId, HttpStatus.OK);
	}

}