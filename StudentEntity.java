package com.demo.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String city;
	private String name;


	public String toString(){
		return "StudentEntity [id=" +id +",name=" +name+",city=" +city +"]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentEntity(String city, String name) {
		super();
		
		this.city = city;
		this.name = name;
		
	}
	private Certificate certi;
	public Certificate getCerti(){
		return certi;
		
	}
	public void setCerti(Certificate certi){
		this.certi=certi;
		
	}
	public StudentEntity(String name,String city,Certificate certi){
		super();
		this.name=name;
		this.city=city;
		this.certi=certi;
		
		
	}


		
	


}
		
		
	

