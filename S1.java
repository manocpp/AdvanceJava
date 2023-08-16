package com.manoj.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h2>Welcome to servlet S1</h2>");
	out.println("<a href='S2'>Click here to visit S2</a> | <a href='S3'>Click here to visit S3</a>");
	
	}

}
