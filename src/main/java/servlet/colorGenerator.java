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

@WebServlet("/color")
public class colorGenerator extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> colors = Arrays.asList("red","yellow","purple","blue","gray","white","black","pink","green","orange");
		String color = colors.get(new Random().nextInt(colors.size()));
		resp.getWriter().print("<div style='border:2px solid black;height:300px;width:300px;border-radius:20% ;background-color:" + color +" '></div>");
	}

}
