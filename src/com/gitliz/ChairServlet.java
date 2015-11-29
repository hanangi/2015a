package com.gitliz;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gitliz.model.Chair;

@SuppressWarnings("serial")
public class ChairServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		Calendar c = Calendar.getInstance();
		c.set(2015, 10, 15);
		
		Chair chair = new Chair(c.getTime());
		
		resp.getWriter().println(chair.getFormatedDate());
	}
}
