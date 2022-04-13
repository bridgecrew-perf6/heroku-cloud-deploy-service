package com.studproject.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentModel {

	
	
	private int id;
	private String name;
	private int age;
	private String gender;

	private long contact_no;
	private String location;
	
	
	


	public StudentModel() {
		// TODO Auto-generated constructor stub
		super();
	}
		
	
	public StudentModel(int id, String name, int age, String gender, long contact_no, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact_no = contact_no;
		this.location = location;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
