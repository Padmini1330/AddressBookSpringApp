package com.bridgelabz.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.dto.ContactDTO;
import com.bridgelabz.exception.AddressBookException;
import com.bridgelabz.model.ContactData;
import com.bridgelabz.repository.ContactRepository;

@Service
public class AddressBookService implements IAddressBookService 
{
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<ContactData> getContact() 
	{
		return contactRepository.findAll();
	}

	@Override
	public ContactData getContactById(int contactId) 
	{
		return contactRepository.findById(contactId).orElseThrow(() -> new AddressBookException("Contact not found!"));
	}

	@Override
	public List<ContactData> getContactbyCity(String city) 
	{
		return contactRepository.findContactByCity(city);
	}
	
	@Override
	public List<ContactData> getContactbyState(String state) 
	{
		return contactRepository.findContactByState(state);
	}
	
	@Override
	public List<ContactData> getContactbyZipCode(String zipCode) 
	{
		return contactRepository.findContactByZipCode(zipCode);
	}
	@Override
	public ContactData createContact(ContactDTO contactDTO) 
	{
		ContactData contactData = new ContactData(contactDTO);
		return contactRepository.save(contactData);
	}

	@Override
	public ContactData updateContact(int contactId, ContactDTO contactDTO) 
	{
		ContactData contactData = contactRepository.findById(contactId)
				.orElseThrow(() -> new AddressBookException("Contact not found!"));
		contactData.updateContactData(contactDTO);
		return contactRepository.save(contactData);
	}

	@Override
	public void deleteContact(int contactId) 
	{
		contactRepository.findById(contactId).orElseThrow(() -> new AddressBookException("Contact not found!"));
		contactRepository.deleteById(contactId);
	}

}