package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectdemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
			String url="jdbc:postgresql://localhost:5432/demostud";
			String unm="postgres";
			String pwd="Sam1625";
			con=DriverManager.getConnection( url,unm,pwd);
			System.out.println("Connection Sucessfull...");
			stmt=con.createStatement();
			rs=stmt.executeQuery("Select  * from Student where sname="+"'sam'");
			while(rs.next())
			{
 				System.out.println(rs.getString("sname")+" "+rs.getInt("id"));
			}
		}catch(Exception e)
		{
			System.out.println(e);
	}

}
}
