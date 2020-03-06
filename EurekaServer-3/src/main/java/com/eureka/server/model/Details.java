package com.eureka.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerstatus")
public class Details {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Status_ID")
	private long id;
	
	@Column(name="Booked_status")
	private String status;
	
	@Column(name="vechicle_name")
	private String vechicle;
	
	@Column(name="model")
	private String model;

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Details(long id, String status, String vechicle, String model) {
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
		return "ServiceDetails [id=" + id + ", status=" + status + ", vechicle=" + vechicle + ", model=" + model + "]";
	}
	
	
	
	
}
