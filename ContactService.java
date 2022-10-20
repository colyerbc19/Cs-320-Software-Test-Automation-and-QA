package main;

import java.util.ArrayList;

public class ContactService {
	
	//creates an in-memory data structures to support storing contacts (no database required)
	public ArrayList<Contact> contactList = new ArrayList<>();
	
	//Constructor for contact list 
	public ContactService() {
		this.contactList = new ArrayList<Contact>();
	}
	
	//method to add a new contactId to the contactsList
	public String addContactId(Contact contact) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("Contact Id already in use.");
			}
		}
		contactList.add(contact);
		return "successfully added contact";
		
	}
	
	//a method to be able to delete contacts per contact ID
	public String deleteContact(String contactId) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contactId)) {
				contactList.remove(i); 
				return "Contact successfully removed";
			}
		}
		throw new IllegalArgumentException("Contact unable to be removed");
	}

	//method to update a first name per contactId
	public String updateFirstName(String contactId, String firstName) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contactId)) {
				contactList.get(i).setFirstName(firstName); 
				return firstName;
			}
	}
		throw new IllegalArgumentException("Contact not found");
	}
	
	
	//method to update a last name per contactId
	public String updateLastName(String contactId, String lastName) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contactId)) {
				contactList.get(i).setLastName(lastName); 
				return lastName;
			}
	}
		throw new IllegalArgumentException("Contact not found");
	}
	
	//method to update a phone number per contactId
	public String updatePhone(String contactId, String phone) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contactId)) {
				contactList.get(i).setPhone(phone); 
				return phone;
			}
	}
		throw new IllegalArgumentException("Contact not found");
	}
	
	//method to update a address per contactId
	public String updateAddress(String contactId, String address) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactId().equals(contactId)) {
				contactList.get(i).setAddress(address); 
				return address;
			}
	}
		throw new IllegalArgumentException("Contact not found");
	}
	
	
	
	
}
