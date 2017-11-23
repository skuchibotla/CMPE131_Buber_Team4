package buber;

import java.sql.*;

public class Bike{

	double timestart;
	double timeend;
	double price;
	private String strOwnerName;
	private int intOwnerId;
	private int intBikeId;
	private double doublePrice;
	private int intRating;
	private String strLocation;
	private double doubleStartTime;
	private double doubleEndTime;
	
	
	public Bike(String strOwnerName, int intOwnerId,
	int intBikeId, double doublePrice, int intRating,
	String strLocation, double doubleStartTime, double doubleEndTime){
		this.strOwnerName = strOwnerName;
		this.intOwnerId = intOwnerId;
		this.intBikeId = intBikeId;
		this.doublePrice = doublePrice;
		this.intRating = intRating;
		this.strLocation = strLocation;
		this.doubleStartTime = doubleStartTime;
		this.doubleEndTime = doubleEndTime;
		insertBike(this.strOwnerName, this.intOwnerId, this.intBikeId, this.doublePrice, this.intRating, this.strLocation, this.doubleStartTime ,this.doubleEndTime );
		
	}
	
	String getOwnerName(){
		return this.strOwnerName;
	}

	int getOwnerId(){
		return this.intOwnerId;
	}
	
	int getBikeId(){
		return this.intBikeId;
	}
	
	double getprice() {
		return this.doublePrice;
	}

	void setstarttime() {

	}

	double getStartTime() {
		return this.doubleStartTime;
	}

	void setbikename() {

	}

	void setendtime() {

	}

	double getEndTime() {
		return this.doubleEndTime;

	}

	void addbike() {

	}

	/*
	String getrentedBike() {
		String s = "your bike name is" + getbikename() + " " + " from " + getstarttime() + "till " + getendtime() + " ";
		return s;
	}
	*/

	/*
	String getUserBike() {
		//System.out.println("Bike  \tPrice");
		//String s = "bike name is " + getbikename() + " bike " + "and is $" + getprice();
		String s= getbikename()+"  \t"+getprice();		
		return s;
	}
	*/
	
	
	public void insertBike(String strOwnerName, int intOwnerId, int intBikeId, double doublePrice, int intRating, String strLocation, double doubleStartTime ,double doubleEndTime ) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/buber", "wyatt", "password");
			PreparedStatement oPrStmt = conn.prepareStatement("INSERT INTO bike (ownerName, ownerId, bikeId, price, rating, location, startTime, endTime) VALUES(?,?,?,?,?,?,?,?)");// ? represents some parameter to include
																							
			oPrStmt.setString(1, strOwnerName);// parameter index start from 1
			oPrStmt.setInt(2, intOwnerId);
			oPrStmt.setInt(3, intBikeId);
			oPrStmt.setDouble(4, doublePrice);
			oPrStmt.setInt(5, intRating);
			oPrStmt.setString(6, strLocation);
			oPrStmt.setDouble(7, doubleStartTime);
			oPrStmt.setDouble(8, doubleEndTime);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

