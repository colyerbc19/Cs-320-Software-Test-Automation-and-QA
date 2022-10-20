package main;

import java.util.Date;

public class Appointment {

	final String appointmentId;
	Date date; 
	String description; 
	
	public Appointment(String appointmentId, Date date, String description) {
		
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invaild Appointment Id");
		}
		
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invaild Appointment date");
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invaild Appointment description");
		}
		
		this.appointmentId = appointmentId;
		this.date = date;
		this.description= description;
	}

	
	public String getAppointmentId() {
		return appointmentId;
	}

	public Date getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	
	
	public void setDate(Date date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
