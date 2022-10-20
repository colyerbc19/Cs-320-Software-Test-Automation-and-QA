package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;

class AppointmentTest {

//tests that a new  appointments can be name and values can be assigned which also tests getters 
	@Test
	void testAppointment() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		
		assertTrue(appointment.getAppointmentId().equals("111"));
		assertTrue(appointment.getDate().equals(date));
		assertTrue(appointment.getDescription().equals("This is an appointment description"));
		
	}
	
//tests that the appointmentId is not longer than 10 
	@Test
	void testAppointmentIdNotToLong() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678900", date, "This is an appointment description");
			}); 
	}
	
//tests that the appointmentId is not null
	@Test
	void testAppointmentIdNotNull() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date, "This is an appointment description");
			}); 
	}

	
//tests that the date is not in the past
	@Test
	void testDateNotInPast() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2021, Calendar.JANUARY, 1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678900", date, "This is an appointment description");
			}); 
	}
		
//tests that the date is not null
	@Test
	void testDateNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("111", null, "This is an appointment description");
			}); 
	}
	
	
//tests that the a description is not longer than 50 
	@Test
	void testDescriptionToLong() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678900", date, "This is an appointment description that is way too long blah blah blah blah blah blah blah");
			}); 
	}
		
//tests that the description is not null
	@Test
	void testDescriptionNotNull() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("111", date, null);
			}); 
	}
	
	//tests the setter for date
	@Test 
	void testSetDate() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		@SuppressWarnings("deprecation")
		Date newDate = new Date(2022, Calendar.NOVEMBER, 25);
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		appointment.setDate(newDate);
		assertTrue(appointment.getDate().equals(newDate));
	}
	
	//tests the setter for description
	@Test 
	void testSetDescription() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		appointment.setDescription("This is a NEW appointment description");
		assertTrue(appointment.getDescription().equals("This is a NEW appointment description"));
	}	
}
