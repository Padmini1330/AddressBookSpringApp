package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.bridgelabz.dto.ContactDTO;
import com.bridgelabz.model.ContactData;

@Service
public class AddressBookService implements IAddressBookService 
{

	@Override
	public List<ContactData> getContact() 
	{
		List<ContactData> contactList = new ArrayList<>();
        contactList.add(new ContactData(1,new ContactDTO("Padmini", "Sharma", "9999999999", "Bangalore", "Karnataka", "560108", "padmini@gmail.com")));
        return contactList;
	}

	@Override
	public ContactData getContactById(int contactId) 
	{
		 ContactData contactData = new ContactData(1,new ContactDTO("Padmini", "Sharma", "9999999999", "Bangalore", "Karnataka", "560108", "padmini@gmail.com"));
	        return contactData;
	}

	@Override
	public ContactData createContact(ContactDTO contactDTO) 
	{
		ContactData contactData=new ContactData(1,contactDTO);
		return contactData;
	}

	@Override
	public ContactData updateContact(int contactId, ContactDTO contactDTO) 
	{
		ContactData contactData=new ContactData(contactId,contactDTO);
		return contactData;
	}

	@Override
	public void deleteContact(int contactId) 
	{
		
	}

}