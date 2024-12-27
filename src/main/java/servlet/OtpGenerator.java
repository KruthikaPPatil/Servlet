package servlet;

import java.io.IOException;

import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otp")
public class OtpGenerator extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	  int otp = new Random().nextInt(100000,1000000);
	  resp.getWriter().print("<div align='center'><h1>The OTP is "+otp+"</h1></div>");
	  }


}

