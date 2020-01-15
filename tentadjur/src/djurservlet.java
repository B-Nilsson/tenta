import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/djurservlet")
public class djurservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/* Broken code
		if i had time i would elect to create multiple servlets
		for each animal and handle it that way. Hopefully
		getting the images to work, otherwise an improvised
		(albeit lying) error message would have to have sufficed.
		 */
		
		String cat = request.getParameter("cat");

		System.out.println("cat: " + cat);
		System.out.println("Sadly the picture of a cat cannot be displayed at this time, please open cat.jpg to view your image");
		System.out.print("<img src=\"cat.jpg\">");
		
		/*
		String dog = request.getParameter("dog");

		System.out.println("dog: " + dog);
		System.out.println("Sadly the picture of a dog cannot be displayed at this time, please open cat.jpg to view your image");
		System.out.print("<img src=\"dog.jpg\">");
		*/
		
		PrintWriter writer = response.getWriter();
		
		String htmlRespone = "<html>";
		htmlRespone += "<h2>" + cat + "<h2/>";
		htmlRespone += "</html>";
		
		writer.println(htmlRespone);
		
	}
}