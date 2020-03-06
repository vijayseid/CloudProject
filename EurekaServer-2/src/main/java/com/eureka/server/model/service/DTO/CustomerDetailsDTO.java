package com.eureka.server.model.service.DTO;

public class CustomerDetailsDTO {

	private long id;
	private String name;
	private String city;
	private String number;
	
	
	
	private long detailsid;
	private String status;
	private String vechicle;
	private String model;	
	
	
	public CustomerDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerDetailsDTO(long id, String name, String city, String number, long detailsid, String status,
			String vechicle, String model) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.number = number;
		this.detailsid = detailsid;
		this.status = status;
		this.vechicle = vechicle;
		this.model = model;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public long getDetailsid() {
		return detailsid;
	}


	public void setDetailsid(long detailsid) {
		this.detailsid = detailsid;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getVechicle() {
		return vechicle;
	}


	public void setVechicle(String vechicle) {
		this.vechicle = vechicle;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "CustomerDetailsDTO [id=" + id + ", name=" + name + ", city=" + city + ", number=" + number
				+ ", detailsid=" + detailsid + ", status=" + status + ", vechicle=" + vechicle + ", model=" + model
				+ "]";
	}
	
	
	
	
	
	

}
