package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {

	public List<Appointment> appointmentList = new ArrayList<>();
	
	//constructor 
	public AppointmentService() {
		this.appointmentList = new ArrayList<Appointment>();
	}
	
	//adds an appointment with a unique appointmentId to appointmentList
	public String addAppointmentId(Appointment appointment) {
		for(int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getAppointmentId().equals(appointment.getAppointmentId())) {
				throw new IllegalArgumentException("Appointment Id already in use.");
			}
		}
		appointmentList.add(appointment);
		return "successfully added appointment";
	}
	
	//method to delete appointments per appointmentId
		public String deleteAppointment(String appointmentId) {
			for(int i = 0; i < appointmentList.size(); i++) {
				if(appointmentList.get(i).getAppointmentId().equals(appointmentId)) {
					appointmentList.remove(i);
					return "Appointment successfully removed";
				}
		}
			throw new IllegalArgumentException("Appointment unable to be removed");
	}
	
	public Date updateDate(String appointmentId, Date date) {
		for(int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getAppointmentId().equals(appointmentId)) {
				appointmentList.get(i).setDate(date); 
				return date;
			}
	}
		throw new IllegalArgumentException("Appointment not found");
	}
	
	public String updateDescription(String appointmentId, String description) {
		for(int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getAppointmentId().equals(appointmentId)) {
				appointmentList.get(i).setDescription(description); 
				return description;
			}
	}
		throw new IllegalArgumentException("Appointment not found");
	}
	


	

	
	
	
}
