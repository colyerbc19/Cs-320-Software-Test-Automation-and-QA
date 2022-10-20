package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import main.Contact;
import main.ContactService;


class ContactServiceTest {

	@Test
	void testAddContactId(){
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		assertTrue(contactService.contactList.size() == 1);
}
	
	@Test
	void testAddUniqueId() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		Contact contact2 = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		assertTrue(contactService.addContactId(contact1) == "successfully added contact" );
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContactId(contact2);
			}); 	
	}
	
	
	@Test
	void testDeleteContact(){
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		//adds and then checks to ensure task was added 
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		assertTrue(contactService.contactList.size() == 1);
		
		//deletes and then checks to ensure the Contact was deleted
		assertTrue(contactService.deleteContact("123") == "Contact successfully removed");
		assertTrue(contactService.contactList.size() == 0);
		
		//checks to make sure contactId that does not exist cannot be deleted
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.deleteContact("999");
			});
		}
	
	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		//ensures Contact is added
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		
		//tests that first name is updated correctly
		assertTrue(contactService.updateFirstName("123", "New contact first name") == "New contact first name");
		assertTrue(contact.getFirstName() == "New contact first name");
		
		//throws exception if contactId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateFirstName("999", "New contact first name");
			});
		
	}
	
	@Test
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		//ensures Contact is added
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		
		//tests that last name is updated correctly
		assertTrue(contactService.updateLastName("123", "New contact last name") == "New contact last name");
		assertTrue(contact.getLastName() == "New contact last name");
		
		//throws exception if contactId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateLastName("999", "New contact last name");
			});
		
	}

	@Test
	void testUpdatePhone() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		//ensures Contact is added
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		
		//tests that phone is updated correctly
		assertTrue(contactService.updatePhone("123", "New contact phone number") == "New contact phone number");
		assertTrue(contact.getPhone() == "New contact phone number");
		
		//throws exception if contactId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updatePhone("999", "New contact phone number");
			});
		
	}
	
	@Test
	void testUpdateAddress() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		
		//ensures Contact is added
		assertTrue(contactService.addContactId(contact) == "successfully added contact" );
		
		//tests that Address is updated correctly
		assertTrue(contactService.updateAddress("123", "New contact address") == "New contact address");
		assertTrue(contact.getAddress() == "New contact address");
		
		//throws exception if contactId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.updateAddress("999", "New contact address");
			});
		
	}
	
	
	
	
	
	
	
	}
	
	
	
	




		



