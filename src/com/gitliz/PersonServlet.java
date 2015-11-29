package com.gitliz;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PersonServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		Person p = new Person();
		p.setName("גגגג");
		p.setAge(33);
		
		Person p1 = new Person();
		p1.setName("dfgadsfa");
		p1.setAge(334);
		
		Person p2 = new Person();
		p2.setName("reraewrw");
		p2.setAge(3);
		
		//Person person3 = new Person(115, 10,15, 16, 30);
		
		Calendar c = Calendar.getInstance();
		c.set(2015, 10, 15);
		
		Person pee = new Person(c.getTime());
		
		c.set(2016, 2, 1);
		Person pee1 = new Person(c.getTime());
		
		resp.getWriter().println(p.getHtmlDescription() + "<br>" +
		p1.getHtmlDescription() + "<br>" + p2.getHtmlDescription());
	}
}
