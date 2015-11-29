package com.gitliz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {

	private final int x = 5;
	private String name;
	private float age;
	private static int counter = 0;
	
	private Date date;
	
	public Person() {
	}
	
	public Person(Date date) {
		this.date = date;
	}
	
	/*public Person(int y, int m, int d, int h, int minute) {
		//this.date = new Date(y, m, d, h, minute);
		this.date = Date.parse("2015-11-10");
		
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		c.set(2015, 10, 15);
		
		DateFormat df = new SimpleDateFormat("yyyy-M-d!");
		df.parse(2015-3-12)""
		
		System.out.println("forammated date: " + df.format(c.getTime()));
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.getYear() + "/" + date.getMonth() + "/" + date.getDay());
	}*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 21) {
			this.name = name;
		}else {
			System.out.println("name is too long");
		}
	}
	public float getAge() {
		counter++;
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	

	public static int sum(int x ,int y) {
		return x+y;
	}
	
	public String getHtmlDescription() {
		String result = "<b>Name:</b> " + name + ", <b>Age:</b> " + age;
		return result;
	}
	
}
