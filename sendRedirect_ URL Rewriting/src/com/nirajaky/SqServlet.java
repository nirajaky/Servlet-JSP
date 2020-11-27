package com.nirajaky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = Integer.parseInt(req.getParameter("k"));
		k= k*k;
		System.out.println(k);
		
//		int k = (int)req.getAttribute("k");    // to receive value from another servlet
//		k = k*k;
//		PrintWriter out = res.getWriter();
//		out.println("Square is " + k);
	}
}
