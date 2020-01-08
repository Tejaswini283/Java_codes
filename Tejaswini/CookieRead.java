package store1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cube")
public class CookieRead {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Cookie []cookie=req.getCookies();
		int sum=0;
		for(Cookie ck:cookie) {
			if(ck.getName().equals("deloitte.sum")) {
				sum=Integer.parseInt(ck.getValue());
				break;
				
				
			}
		}
		int cube=sum*sum*sum;
		//res.getWriter().println("answer="+cube);
		HttpSession ssn=req.getSession();
		 ssn.setAttribute("cube", cube);
		res.sendRedirect("home.jsp");
	}

}
