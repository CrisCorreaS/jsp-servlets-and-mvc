package com.git.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamContextServlet")
public class ParamContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ParamContextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Step 1: set content type
		response.setContentType("text/html");
		
		// Step 2: get printwriter
		PrintWriter out = response.getWriter();
		
		// Step 3: read configuration params
		ServletContext context = getServletContext(); // inherit from HttpServlet

		String maxCartSize = context.getInitParameter("max-shopping-cart-size");
		String teamName = context.getInitParameter("project-team-name");
		
		// Step 4: generate HTML content
		out.println("<html><body>");

		out.println("Max cart: " + maxCartSize);
		out.println("<br/><br/>");
		out.println("Team name: " + teamName);
		
		out.println("</body></html>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
