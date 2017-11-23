
package buber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertServlet extends HttpServlet {
	
	private static final long serialVersionUID = 2L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) //constructs doPost method(request, response) that takes a request from the server and response that it wants the server to perform
			throws ServletException, IOException {

		response.setContentType("text/html");									//response set to html text type
		PrintWriter out = response.getWriter();									//Constructs a print writer that gets input from response
		
		
		
		//String ownerName, int strOwnerId, int strBikeId, double strPrice, int strRating, String location, double strStartTime, double strEndTime
		
		String strOwnerName = request.getParameter("ownerName");
		String strOwnerId = request.getParameter("ownerId");
		int intOwnerId = Integer.parseInt(strOwnerId);
		String strBikeId= request.getParameter("bikeId");
		int intBikeId = Integer.parseInt(strBikeId);
		String strPrice= request.getParameter("price");
		double doublePrice = Double.parseDouble(strPrice);
		String strRating= request.getParameter("rating");
		int intRating = Integer.parseInt(strRating);
		String strLocation= request.getParameter("location");
		String strStartTime= request.getParameter("startTime");
		double doubleStartTime = Double.parseDouble(strStartTime);
		String strEndTime= request.getParameter("endTime");
		double doubleEndTime = Double.parseDouble(strEndTime);
		
		
		if(BikeDao.save(strOwnerName, intOwnerId, intBikeId, doublePrice, intRating, strLocation, doubleStartTime, doubleEndTime)){
			RequestDispatcher rd=request.getRequestDispatcher("saved");			//Construct requestDispatcher to get the 
			rd.forward(request,response);
		}
		else{
			out.print("Error occured while saving data.");
			RequestDispatcher rd=request.getRequestDispatcher("AddBikePage.jsp");
			rd.include(request,response);
		}
		out.close();
		
	}
}

