package new1;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**

 * Servlet implementation class LoginController

 */

@WebServlet("/login")

public class LoginController extends HttpServlet {
private static final long serialVersionUID = 1L;



	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.setHeader("Cache-Control", "no-cache no-store must-revalidate");

		String uName="Teja";
        String password="123";
        String UName=request.getParameter("txtuname");
        String Password=request.getParameter("txtpassword");

		

		if(uName.equals(UName) && password.equals(Password)) {
			HttpSession ssn=request.getSession();
			ssn.setAttribute("user", UName);
			response.sendRedirect("Welcome.jsp");
}

			}
}
	
	