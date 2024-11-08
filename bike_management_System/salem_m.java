package bike_management_System;
import java.sql.*;
public class salem_m extends bkconnect
{
int insert(int s_id,String s_name,int work_e,int selling_e, int age,int c_id) throws SQLException
{
	String str="insert into bikesalem values(?,?,?,?,?,?)";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setInt(1, s_id);
	pst.setString(2, s_name);
	pst.setInt(3, work_e);
	pst.setInt(4, selling_e);
	pst.setInt(5, age);
	pst.setInt(6, c_id);
	int check=pst.executeUpdate();
	return check;
}
void work_exp(int age) throws SQLException
{
	String str="select sname from bikesalem where worde<?";
	PreparedStatement pst=conn.prepareStatement(str);
	pst.setInt(1, age);
	ResultSet rs=pst.executeQuery();
	System.out.println("Staff name");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
	}
}
}
