package com.gitliz.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gitliz.copyconstructor.Car;

@SuppressWarnings("serial")
public class CarServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		Calendar c = Calendar.getInstance();
		c.set(2005, 2, 15);
		
		Car yaris = new Car("12-433-44");
		yaris.setColor("Pink");
		yaris.setModel("Yaris 2005");
		yaris.setFirm("Toyota");
		yaris.setMaxSpeed(164.2f);
		yaris.setDate(c.getTime());
		
		/*Car yaris2 = new Car("12-433-45");
		yaris2.setColor("Green");
		yaris2.setModel("Yaris 2005");
		yaris2.setFirm("Toyota");
		yaris2.setMaxSpeed(164.2f);*/

		c.set(2013, 3, 11);
		
		Car yaris2 = new Car(yaris);
		yaris2.setId("12-433-45");
		yaris2.setColor("Green");
		//yaris.setDate(c.getTime());
		yaris2.getDate().setHours(1);
		
		resp.getWriter().println("Yaris: " + yaris.toString() + "<br>" + "Yaris2: " + yaris2.toString());
	}
}

