package bike_management_System;
import java.sql.*;
public class customer_m extends bkconnect
{
	public int insert(int id,String name,String bikename,String category,int prices) throws SQLException 
	{
		String str="insert into bike values(?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(str);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, bikename);
		pst.setString(4, category);
		pst.setInt(5, prices);
		int check=pst.executeUpdate();
		return check;
	}
	void specific(String category) throws SQLException
	{
		String str="select bikename,prices from bike where category=?";
		PreparedStatement pst=conn.prepareStatement(str);
		pst.setString(1, category);
		ResultSet rs=pst.executeQuery();
		System.out.println("bikename"+"\t"+"prices");
		while(rs.next())
		{
			String name=rs.getString(1);
			String category1=rs.getString(2);
			System.out.println(name+"\t"+category1);
		}	
	}
	public void pricesval(int prices) throws SQLException
	{
		String str="select bikename,category from bike where prices<=?";
		PreparedStatement pst=conn.prepareStatement(str);
		pst.setInt(1, prices);
		ResultSet rs=pst.executeQuery();
		System.out.println("bikename"+"\t"+"category");
		while(rs.next())
		{
			String bikename=rs.getString(1);
			String bikename1=rs.getString(2);
			System.out.println(bikename+"\t"+bikename1);
		}
		}
}
