import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username: " + username);
		System.out.println("password: '" + password);
		
		PrintWriter writer = response.getWriter();
		
		String htmlRespone = "<html>";
		htmlRespone += "<h2>Welcome " + username + "<br/>";
		htmlRespone += "The password you used was " + password + "</h2>";
		htmlRespone += "</html>";
		
		writer.println(htmlRespone);
	}
}