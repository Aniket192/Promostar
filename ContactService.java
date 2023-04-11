package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {
	
	public void SaveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

}


