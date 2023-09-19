package com.trainning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/logic"})
public class PersonServlet extends HttpServlet{
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		String age = req.getParameter("age");
//		String address = req.getParameter("address");
//		
//		resp.setContentType("text/html");
//		
//		PrintWriter printWriter = resp.getWriter();
//		
//		printWriter.println("Name: " + name +
//							"\nAge: " + age +
//							"\nAddress: " + address);
//		printWriter.close();
//
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Name: " + name +
							"Age: " + age +
							"Address: " + address);
		printWriter.close();
	}


}
