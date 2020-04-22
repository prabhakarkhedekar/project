package Servlet;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class Welcome extends GenericServlet  {
	public void init() throws ServletException{
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome to servlet program");
	}
	public void destroy(){
	}
	}

