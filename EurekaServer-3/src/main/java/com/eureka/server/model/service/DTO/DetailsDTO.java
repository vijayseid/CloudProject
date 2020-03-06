package com.eureka.server.model.service.DTO;

public class DetailsDTO {

	private long id;
	private String status;
	private String vechicle;
	private String model;
	
	public DetailsDTO() {
		super();
	}
	
	public DetailsDTO(long id, String status, String vechicle, String model) {
		super();
		this.id = id;
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
		return "DetailsDTO [id=" + id + ", status=" + status + ", vechicle=" + vechicle + ", model=" + model
				+ "]";
	}

	
	
}
