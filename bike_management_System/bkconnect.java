package bike_management_System;
import java.sql.*;
public class bkconnect 
{
public Connection conn;
String dburl="jdbc:mysql://localhost:3306/bike_ms";
String dbuser="root";
String dbpass="accord";

public bkconnect()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(dburl,dbuser,dbpass);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
