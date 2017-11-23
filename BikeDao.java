
package buber;
import java.sql.*;

public class BikeDao {

	public static boolean save(String strOwnerName, int intOwnerId,
			int intBikeId, double doublePrice, int intRating,
			String strLocation, double doubleStartTime, double doubleEndTime) {
		
		boolean isRecordInserted = false;
		try {
			//defining database driver to use
			Class.forName("com.mysql.jdbc.Driver");
			
			//getting connection from the mysql database
			//jdbc:mysql://localhost:3306 is database url
			//login is database name
			//root : username
			//root: password
			//syntex : databaseurl/databasename, username , password
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/buber", "wyatt", "password");
			
			

			//prepared statement is used for secure access
			// ? used for data to put in query
			// actual query to execute is
			// select * from users where username = name and password = pass
			PreparedStatement oPrStmt = con
					.prepareStatement("INSERT INTO bike (ownerName, ownerId, bikeId, price, rating, location, startTime, endTime) VALUES(?,?,?,?,?,?,?,?)");// ? represents some parameter to include
																							
			oPrStmt.setString(1, strOwnerName);// parameter index start from 1
			oPrStmt.setInt(2, intOwnerId);
			oPrStmt.setInt(3, intBikeId);
			oPrStmt.setDouble(4, doublePrice);
			oPrStmt.setInt(5, intRating);
			oPrStmt.setString(6, strLocation);
			oPrStmt.setDouble(7, doubleStartTime);
			oPrStmt.setDouble(8, doubleEndTime);
			
			int nInsertedRecords = oPrStmt.executeUpdate(); // executing the query and getting the updated/inserted row counts from databse
			
			if(nInsertedRecords>0){ // check that the data is inserted successfully or not
				isRecordInserted = true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return isRecordInserted;
	}


}


