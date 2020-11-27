package com.nirajaky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//HttpSession: to pass the data from one servlet to another(for redirecting)
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		k= k*k; 
		System.out.println(k);
		
//		int k = (int)req.getAttribute("k");    // to receive value from another servlet
//		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Square is " + k);
	}
}
