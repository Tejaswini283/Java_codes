package com.deloitte;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/cube")
public class Cubeservlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {	
	//public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {	
 int cube=0;
 HttpSession ssn=req.getSession();
 //int a=(int) req.getAttribute("sum");
 //int sum=Integer.parseInt(req.getParameter("sum"));
 int sum=(int)(ssn.getAttribute("sum"));
 
	cube=(sum*sum*sum);
	res.getWriter().println("sum is"+sum);
	res.getWriter().println("cube is"+cube);
	}
	
}
