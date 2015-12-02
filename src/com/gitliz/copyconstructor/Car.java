package com.gitliz.copyconstructor;

import java.util.Date;
/**
 * This class represents a car. 
 * @author hanang
 */
public class Car {

	private String id;
	
	private String color;
	private float maxSpeed;
	
	private String firm;
	private String model;
	
	private Date date;
	
	public Car(String id) {
		this.id = id;
	}
	
	public Car(String id, String color) {
		this.id = id;
		this.color = color;
	}
	
	public Car(Car car) {
		//this(car.getId()); //assign by overloading constructor 
		//this.id = car.getId(); //assign by reference.
		
		this(car.getId(), car.getColor()); //assign by overloading constructor 
		//this.color = car.getColor();
		
		this.firm = car.getFirm();
		this.model = car.getModel();
		this.maxSpeed = car.getMaxSpeed();
		this.date = new Date(car.getDate().getTime()); // very gooood!!!
		//this.date = car.getDate(); //very bad!!!!
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getMaxSpeed() {
		return maxSpeed;
	}
	
	
	/**
	 * prints all the values of this instance.
	 */
	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", maxSpeed=" + maxSpeed + ", firm=" + firm + ", model=" + model
				+ ", date=" + date + "]";
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String getFirm() {
		return firm;
	}
	
	public void setFirm(String firm) {
		this.firm = firm;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
