import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class listservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String fruits = request.getParameter(fruits);
		System.out.println("apple");
		
		/*
		String fruits = request.getParameter("name");
		
		System.out.println("username: " + fruits);

		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		
		String listcat = request.getParameter("fruits");
		System.out.println("This list includes: " + fruits);
		
		
		String listcat = request.getParameter("fruits");
		System.out.println("This list includes: " + listcat);
		*/
	}
}