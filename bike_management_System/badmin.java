package bike_management_System;
import java.sql.*;
public class badmin extends bkconnect
{
void see_customer() throws SQLException
{
	String str="Select * from bike";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("cid"+"\t"+"name"+"\t"+"bikename"+"\t"+"category"+"\t"+"prices");
	while(rs.next()) 
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5));
	}
}
void see_staff() throws SQLException
{
	String str="Select * from bikesalem";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("sid"+"\t"+"sname"+"\t"+"worde"+"\t"+"sellingss"+"\t"+"age"+"\t"+"cid");
	while(rs.next()) 
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t\t"+rs.getInt(5)+"\t"+rs.getInt(6));
	}
}
void see_sale_per() throws SQLException
{
	String str="select max(age) as result from bikesalem";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("maximum age");
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
	}
}
void see_category_max()throws SQLException
{
	String str="select max(category) as 'result' from bike";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("maximum category selling bike");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
	}
}
int update_bike(String new_val,int cid) throws SQLException
{
	String str="update bike set bikename=? where cid=?";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setString(1, new_val);
	pst.setInt(2,cid);
	int check=pst.executeUpdate();
	return check;	
}
int update_bikesalem(String new_val,int id) throws SQLException
{
	String str="update bikesalem set sellingss=? where sid=?";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setString(1, new_val);
	pst.setInt(2,id);
	int check=pst.executeUpdate();
	return check;	
}
int delete_bike(int id) throws SQLException
{
	String str="delete from bike where cid=?";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setInt(1,id);
	int check=pst.executeUpdate();
	return check;	
}
int delete_bikesalem(int id) throws SQLException
{
	String str="delete from bikesalem where sid=?";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setInt(1,id);
	int check=pst.executeUpdate();
	return check;	
}
void leftjoin() throws SQLException
{
	String str="select bike.cid,bike.name,bikesalem.sname from bike right join bikesalem on bike.cid=bikesalem.cid";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("cid"+"\t"+"bike name"+"\t"+"staff name"+"\t");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
	}
}
void rightjoin() throws SQLException
{
	String str="select bike.name,bike.cid,bikesalem.sname from bike right join bikesalem on bike.cid=bikesalem.cid";
	PreparedStatement pst=conn.prepareStatement(str);
	ResultSet rs=pst.executeQuery();
	System.out.println("bike name"+"\t"+"customer id"+"\t"+"staff name"+"\t");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
	}
}
}
