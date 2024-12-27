package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/toss")
public class TossGenerator extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	List<String> Toss = Arrays.asList("Head","Tail");
	String Tosss = Toss.get(new Random().nextInt(Toss.size()));
	
	resp.getWriter().print("<h1>The Coined Toss turns to be "+Tosss+"</h1>");
	
	
}
}
