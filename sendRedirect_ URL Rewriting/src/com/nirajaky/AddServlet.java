package com.nirajaky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int k = a+b;
		System.out.println(k);
		
		res.sendRedirect("sq?k=10");   // URL Rewriting: Redrects to another path
		
//		req.setAttribute("k", k);      // to send data to another Servlet
//		
//		//Calling Another Servlet from current Servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq");  // sq : is url Pattern of another Servlet
//		rd.forward(req, res);           // Frowards req,res Objects
//		
//		PrintWriter out = res.getWriter();
//		out.println("Result is " + k);
	}

}
