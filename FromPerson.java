package com.trainning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/view-user"})
public class FromPerson extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<from action='/logic' method='POST'>");
		printWriter.println("Name: <input type='text' name='name'>");
		printWriter.println("Age: <input type='text' name='age'>");
		printWriter.println("Address: <input type='text' name='address'>");
		printWriter.println("<button type='submit'>Submit</button>");
		printWriter.println("</from>");
		printWriter.close();
	}
}
