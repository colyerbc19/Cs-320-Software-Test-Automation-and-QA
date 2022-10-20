package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;
import main.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testAddTaskId() {
		AppointmentService appointmentService = new AppointmentService();
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		
		assertTrue(appointmentService.addAppointmentId(appointment) == "successfully added appointment" );
		assertTrue(appointmentService.appointmentList.size() == 1);
		
	}
	
	@Test
	void testAddUniqueId() {
		AppointmentService appointmentService = new AppointmentService();
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Appointment appointment1 = new Appointment("111", date, "This is an appointment description");
		Appointment appointment2 = new Appointment("111", date, "This is an appointment description");
		
		assertTrue(appointmentService.addAppointmentId(appointment1) == "successfully added appointment" );
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointmentId(appointment2);
			}); 	
	}
	
	@Test
	void testDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		
		//adds and then checks to ensure appointment was added 
		assertTrue(appointmentService.addAppointmentId(appointment) == "successfully added appointment" );
		assertTrue(appointmentService.appointmentList.size() == 1);
		
		//deletes and then checks to ensure the appointment was deleted
		assertTrue(appointmentService.deleteAppointment("111") == "Appointment successfully removed");
		assertTrue(appointmentService.appointmentList.size() == 0);
		
		//checks to make sure appointmentId that does not exist cannot be deleted
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.deleteAppointment("999");
			});
	}

	@Test
	void testUpdateDate() {
		AppointmentService appointmentService = new AppointmentService();
		
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		
		@SuppressWarnings("deprecation")
		Date newDate = new Date(2022, Calendar.NOVEMBER, 25);
		
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		
		//ensures appointment is added
		assertTrue(appointmentService.addAppointmentId(appointment) == "successfully added appointment" );
		
		//tests that date is updated correctly
		assertTrue(appointmentService.updateDate("111", newDate) == newDate);
		assertTrue(appointment.getDate() == newDate);
		
		//throws exception if appointmentId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.updateDate("999", newDate);
			});
		
	}
	
	@Test
	void testUpdateDescription() {
		AppointmentService appointmentService = new AppointmentService();
		
		@SuppressWarnings("deprecation")
		Date date = new Date(2022, Calendar.DECEMBER, 31);
		
		
		Appointment appointment = new Appointment("111", date, "This is an appointment description");
		
		//ensures appointment is added
		assertTrue(appointmentService.addAppointmentId(appointment) == "successfully added appointment" );
		
		//tests that description is updated correctly
		assertTrue(appointmentService.updateDescription("111", "This is a NEW appointment description") == "This is a NEW appointment description");
		assertTrue(appointment.getDescription() == "This is a NEW appointment description");
		
		//throws exception if appointmentId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.updateDescription("999", "This is an NEW appointment description");
			});
		
	}
	
	
	
	
	
	
	

}
