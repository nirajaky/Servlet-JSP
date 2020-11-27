package com.nirajaky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int k = (int)req.getAttribute("k");    // to receive value from another servlet
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Square is " + k);
	}
}
