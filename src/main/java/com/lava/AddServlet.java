package com.lava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("n1"));
		int j=Integer.parseInt(req.getParameter("n2"));
		int k=i+j;
		
		req.setAttribute("k", k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
		PrintWriter out=res.getWriter();
//		To print in the webpage
		out.println(k);
	}
}
