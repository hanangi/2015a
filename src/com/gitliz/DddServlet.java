package com.gitliz;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DddServlet extends HttpServlet {
	private int counter = 0;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		/*WeddingDress wd = new WeddingDress();
		wd.setColor("Off white");
		wd.setSize((short)16);
		wd.setCreationDate(new Date());
		
		resp.getWriter().println(wd.getHtmlDescription());*/
		
		counter++;
		resp.getWriter().println(counter);
	}
}
