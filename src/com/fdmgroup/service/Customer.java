package com.fdmgroup.service;

public class Customer {
	private Person person;
	private String type;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Person person, String type) {
		super();
		this.person = person;
		this.type = type;
	}
	
	public void init(){
		System.out.println("Initializing Customer object...");
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + "]";
	}
	
	
}
