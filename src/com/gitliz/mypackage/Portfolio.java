package com.gitliz.mypackage;

import com.gitliz.Person;

public class Portfolio {

	private static final int PORT_MAX_SIZE = 5;
	private String title;
	private Person[] persons;
	private int index;
	
	public Portfolio() {
		this.persons = new Person[PORT_MAX_SIZE];
	}
	
	public void addPerson(Person person) {
		this.persons[index++] = person;
	}
	
	public String getH() {
		String ret = "<h1>" + title + "</h1><br>";
		
		for (int i = 0; i < persons.length; i++) {
			ret += persons[i].getHtmlDescription() + "<br>";
		}
		
		return ret;
		
	}
}
