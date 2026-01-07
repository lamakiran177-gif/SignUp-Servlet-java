package mysign;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/url")
public class Myclass extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter po=res.getWriter();
		String n=req.getParameter("name");
		String c=req.getParameter("city");
		String e=req.getParameter("email");
		String p=req.getParameter("pass");
		String ad=req.getParameter("ad1");
		String add=req.getParameter("ad2");
		String s=req.getParameter("state");
		String z=req.getParameter("zip");
		
		po.println("Your city is: "+c);
		po.println("Your email is: "+e);
		po.println("Your pass is: "+p);
		po.println("Your add1 is: "+ad);
		po.println("Your add2 is: "+add);
		po.println("Your state is: "+s);
		po.println("Your zip is: "+z);
		
		
		
	}

}
