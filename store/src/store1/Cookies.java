package store1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/show")
public class Cookies extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("t1"));
		 int b = Integer.parseInt(req.getParameter("t2"));
		  int sum = a+b;
		  Cookie cookie=new Cookie("deloitte.sum",String.valueOf(sum));
		  res.addCookie(cookie);
		  res.sendRedirect("cube");
		  
}
}
