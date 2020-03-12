package com.eureka.server.model.service.DTO;

public class CSVDTO {
	
	private String City;
	private String Name;
	private String Contact;
	
	
	
	public CSVDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CSVDTO(String city, String name, String contact) {
		super();
		City = city;
		Name = name;
		Contact = contact;
	}
	
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return "CSVDTO [City=" + City + ", Name=" + Name + ", Contact=" + Contact + "]";
	}
	
	
	

}
