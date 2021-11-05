package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bridgelabz.dto.ContactDTO;
import com.bridgelabz.exception.AddressBookException;
import com.bridgelabz.model.ContactData;

@Service
public class AddressBookService implements IAddressBookService 
{
	List<ContactData> contactList = new ArrayList<>();

	@Override
	public List<ContactData> getContact() 
	{
		return contactList;
	}

	@Override
	public ContactData getContactById(int contactId) 
	{
		return contactList.stream().filter(contact -> contact.getContactId() == contactId).findFirst()
				.orElseThrow(() -> new AddressBookException("Contact not found!"));
	}

	@Override
	public ContactData createContact(ContactDTO contactDTO) 
	{
		ContactData contactData = new ContactData(contactList.size()+1, contactDTO);
		contactList.add(contactData);
		return contactData;
	}

	@Override
	public ContactData updateContact(int contactId, ContactDTO contactDTO) 
	{
		contactList.stream().filter(contact -> contact.getContactId() == contactId).findFirst()
				.orElseThrow(() -> new AddressBookException("Contact not found!"));
		contactList.remove(contactId - 1);
		ContactData contactData = new ContactData(contactId, contactDTO);
		contactList.add(contactId - 1, contactData);
		return contactData;
	}

	@Override
	public void deleteContact(int contactId) 
	{
		contactList.stream().filter(contact -> contact.getContactId() == contactId).findFirst()
				.orElseThrow(() -> new AddressBookException("Contact not found!"));
		contactList.remove(contactId - 1);
	}

}