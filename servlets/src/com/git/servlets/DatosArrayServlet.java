package com.git.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DatosArrayServlet")
public class DatosArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MvcDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Step 0: Add data
		String[] students = {"María", "Carlos", "Mohamed", "Uxía"};
		request.setAttribute("student_list", students);
		
		// Step 1: get request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp");
			
		// Step 2: forward the request to JSP
		dispatcher.forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
