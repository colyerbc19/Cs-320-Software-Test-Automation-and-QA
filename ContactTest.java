package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {

	//Testing that a new contact is created and assigning proper values 
	@Test
	void testContact() {
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		assertTrue(contact.getContactId().equals("123"));
		assertTrue(contact.getFirstName().equals("Brent"));
		assertTrue(contact.getLastName().equals("Colyer"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 first street"));
	}
	
//tests to ensure values are not longer than 10
	@Test
	void testContactContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789000", "Brent", "Colyer", "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "BrentBrentBrent", "Colyer", "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", "ColyerColyer", "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactPhoneNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", "Colyer", "123456789111", "123 first street");
		});	}
	
	@Test
	void testContactAdressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", "Colyer", "0123456789", "123 first street south north east west");
		});	}
		
		
//Test to ensure values cannot be null
	@Test
	void testContactContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Brent", "Colyer", "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", null, "Colyer", "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", null, "0123456789", "123 first street");
		});	}
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", "Colyer", null, "123 first street");
		});	}
	
	@Test
	void testContactAdressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Brent", "Colyer", "0123456789", null);
		});	}
	

	@Test
	void testsetFirstName() {
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		contact.setFirstName("This is a new contact first name");
		assertTrue(contact.getFirstName().equals("This is a new contact first name"));
	}

	@Test
	void testsetLastName() {
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		contact.setLastName("This is a new contact last name");
		assertTrue(contact.getLastName().equals("This is a new contact last name"));
	}
	
	@Test
	void testsetPhone() {
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		contact.setPhone("This is a new contact phone number");
		assertTrue(contact.getPhone().equals("This is a new contact phone number"));
	}
	
	@Test
	void testsetAddress() {
		Contact contact = new Contact("123", "Brent", "Colyer", "0123456789", "123 first street");
		contact.setAddress("This is a new contact address");
		assertTrue(contact.getAddress().equals("This is a new contact address"));
	}
	
	
}
