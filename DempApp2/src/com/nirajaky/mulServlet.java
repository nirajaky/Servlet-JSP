package com.nirajaky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mulServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int x = Integer.parseInt(req.getParameter("n1"));
		int y = Integer.parseInt(req.getParameter("n2"));
		
		int result = x*y;
		PrintWriter out = res.getWriter();
		out.println("Result is " + result);
	}

}
