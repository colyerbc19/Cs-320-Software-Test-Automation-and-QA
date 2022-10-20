package main;


public class Contact {

	final private String contactId; 
	private String firstName; 
	private String lastName;
	private String phone;
	private String address;

	//creates a constructor that checks parameters
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
	
	if(contactId == null || contactId.length() > 10) {
		throw new IllegalArgumentException("Invaild contactId");
	}
	
	if(firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Invaild firstName");
	}
	
	if(lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Invaild lastName");
	}
	
	if(phone == null || phone.length() != 10) {
		throw new IllegalArgumentException("Invaild phone");
	}
	
	if(address == null || address.length() > 30) {
		throw new IllegalArgumentException("Invaild address");
	}
	
//sets conactId 
	this.contactId = contactId; 
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.phone = phone;
}

//method to return the contactId
public String getContactId() {
	return contactId; 
}
//method to return the first name
public String getFirstName() {
	return firstName; 
}
//method to return the last name 
public String getLastName() {
	return lastName; 
}
//method to return the phone number 
public String getPhone() {
	return phone; 
}
//method to return the address 
public String getAddress() {
	return address; 
}

//method to set first name
public void setFirstName(String firstName) {
	this.firstName = firstName; 	
}

//method to set last name
public void setLastName(String lastName) {
	this.lastName = lastName; 	
}

//method to set phone number 
public void setPhone(String phone) {
	this.phone = phone; 
}

//method to set address 
public void setAddress(String address) {
	this.address = address;
}

}
