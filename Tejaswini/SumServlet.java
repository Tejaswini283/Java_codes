package com.deloitte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/show")
public class SumServlet extends HttpServlet{
//	@Override
	private static final long serialVersionUID=1L;
	//public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {	
		 int sum=0;
		int a = Integer.parseInt(req.getParameter("t1"));
		 int b = Integer.parseInt(req.getParameter("t2"));
		  sum=a+b;
//		res.getWriter().println("sum is"+sum);
//		 RequestDispatcher rd=req.getRequestDispatcher("cube");
//		 req.setAttribute("sum",sum);
//		 rd.forward(req, res);
		 HttpSession ssn=req.getSession();
		 ssn.setAttribute("sum", sum);
		 //res.sendRedirect("cube?sum="+sum);
		 res.sendRedirect("cube");
	}
}

