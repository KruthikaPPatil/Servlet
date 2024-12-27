package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/age")
public class AgeCalculator extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("Name");
		int yob = Integer.parseInt(req.getParameter("yob"));
		String color = req.getParameter("color");
		resp.getWriter().print("<h1>Hello "+name+", and your age is "+(2024-yob)+" </h1>");
		resp.getWriter().print("<div style='border:2px solid black;height:300px;width:300px;border-radius:50% ;background-color:" + color +" '></div>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("come from form");
		
	}

}

