package com.gitliz.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chair {

	private Date creationDate;
	private SimpleDateFormat sdf; 
	
	public Chair(Date date) {
		sdf = new SimpleDateFormat("y - M - d H:m:ss: :-)");
		creationDate = date;
	}
	
	public Chair(String date) {
		creationDate = new Date( Date.parse(date));
	}

	public String getFormatedDate() {
		return sdf.format(creationDate);
	}
}
