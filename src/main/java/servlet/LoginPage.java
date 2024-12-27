package servlet;

import java.io.IOException;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginPage implements Servlet{

	
	static {
		System.out.println("class loaded");
	}
	public LoginPage() {
		System.out.println("object created");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method called");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("servlet will get destroyed");
		
	}

}
