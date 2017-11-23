<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Add Bikes Page</title>

<head>
<meta charset="UTF-8">
<title>Add Bike Page</title>
</head>
<body>

<form action="save" method="post">
OwnerName:<input type="text" name="ownerName"/><br/><br/>
OwnerID:<input type="text" name="ownerID"/><br/><br/>
BikeID:<input type="text" name="bikeId"/><br/><br/>
Price:<input type="text" name="price"/><br><br/>
Rating:<input type="text" name="rating"/><br/><br/>
Location:<input type="text" name="location"/><br/><br/>
StartTime:<input type="text" name="startTime"/><br><br/>
EndTime:<input type="text" name="endTime"/><br><br/>


<input type="submit" value="save"/>

</form>

<head> 
	<title>display data from the table using jsp</title>
</head> 

<body>
	<TABLE style="background-color: #ffffcc;">
		<TR>
			<TD align="center"><h2>View Bikes Available</h2></TD>
		</TR>
		<TR>
			<TD align="center">
				<A HREF="ListBikes.jsp">
					<font size="4" color="blue">show data from table</font>
				</A>
			</TD>
		</TR>
	</TABLE>

</body> 
</html>

</body>
</html>