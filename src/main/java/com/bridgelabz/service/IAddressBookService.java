package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.dto.ContactDTO;
import com.bridgelabz.model.ContactData;

public interface IAddressBookService 
{
	 	List<ContactData> getContact();
	 	
	    ContactData getContactById(int contactId);
	    
	    ContactData createContact(ContactDTO contactDTO);
	    
	    ContactData updateContact(int contactId,ContactDTO contactDTO);
	    
	    void deleteContact(int contactId);
	    
}