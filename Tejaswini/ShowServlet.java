package com.deloitte;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet{
	@Override
	//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {	
	String name=req.getParameter("t1");
		res.getWriter().println("Hello"+name);
	}

	
}
