package buber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("username");
		String p=request.getParameter("userpass");
		
		if(LoginDao.validate(n, p)){
			RequestDispatcher rd=request.getRequestDispatcher("loggedin");
			rd.forward(request,response);
		}
		else{
			out.print("Sorry username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		//ServletContext sc = getServletContext();
		//sc.getRequestDispatcher("/AddBikePage.html").forward(request, response);
		out.close();
		
	}
	
	/*
	public static void main(String[] args)
	{
		BuberApp.main(args);
	}
	*/

}
