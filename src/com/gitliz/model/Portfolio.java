package com.gitliz.model;

import com.gitliz.Person;

public class Portfolio {

	private static final int MAX_SIZE = 5;
	private int position;
	private Person[] persons;
	
	public Portfolio() {
		this.persons = new Person[MAX_SIZE];
	}
	
	public void addSomething(Person person) {
		this.persons[this.position++] = person;
		
	}
	
	
}
