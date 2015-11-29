package com.gitliz;

import java.util.Date;

public class WeddingDress {
	
	private short size;
	private String color;
	private Date creationDate;
	
	public short getSize() {
		return size;
	}
	public void setSize(short size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}

	public String getHtmlDescription() {
		String result = "<b>Size:</b> " + this.size + ", Color: " + this.color + ", date: " + creationDate.getMonth() + "/" + creationDate.getDate();
		return result;
	}
}
