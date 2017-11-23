
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>

<head>
	<title>display data from the table using jsp</title>
</head>

<body>
	<h2>Data from the table 'bike' of database 'buber'</h2>
<%
	try {
		/* Create string of connection url within specified format with machine
		name, port number and database name. Here machine name id localhost and 
		database name is student. */
		String connectionURL = "jdbc:mysql://localhost:3306/buber";
		// declare a connection by using Connection interface
		Connection connection = null;
		/* declare object of Statement interface that is used for executing sql 
		statements. */
		Statement statement = null;
		// declare a resultset that uses as a table for output data from tha table.
		ResultSet rs = null;
		// Load JBBC driver "com.mysql.jdbc.Driver"
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		/* Create a connection by using getConnection() method that takes parameters 
		of string type connection url, user name and password to connect to database.*/
		connection = DriverManager.getConnection(connectionURL, "wyatt", "password");
		/* createStatement() is used for create statement object that is used for 
		sending sql statements to the specified database. */
		statement = connection.createStatement();
		// sql query to retrieve values from the secified table.
		String QueryString = "SELECT * from bike";
		rs = statement.executeQuery(QueryString);
%>

<TABLE cellpadding="15" border="1" style="background-color: #FF4500;">
	<%
		while (rs.next()) {
	%>
	<TR>
		<TD><%=rs.getString(1)%></TD>
		<TD><%=rs.getInt(2)%></TD>
		<TD><%=rs.getInt(3)%></TD>
		<TD><%=rs.getDouble(4)%></TD>
		<TD><%=rs.getInt(5)%></TD>
		<TD><%=rs.getString(6)%></TD>
		<TD><%=rs.getDouble(7)%></TD>
		<TD><%=rs.getDouble(8)%></TD>
	</TR>
	<% } %>
<%
	// close all the connections.
	rs.close();
	statement.close();
	connection.close();
	} catch (Exception ex) {
%>
	</font>
	<font size="+3" color="red"></b>
<%
	out.println("Unable to connect to database.");
	}
%>
</TABLE>

<TABLE>
	<TR>
		<TD><FORM ACTION="AddBikePage.jsp" method="get" >
		<button type="submit"><-- back</button></TD>
	</TR>
</TABLE>
</font>
</body>
</html>