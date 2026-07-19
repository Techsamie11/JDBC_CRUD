package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class updatedemo {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		try
		{
			String url="jdbc:postgresql://localhost:5432/demostud";
			String unm="postgres";
			String pwd="Sam1625";
			con=DriverManager.getConnection( url,unm,pwd);
			System.out.println("Connection Sucessfull...");
			String sql="update student set sname=? ,age=? where id="+1;
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "samruddhi");
			pstmt.setInt(2, 25);
			int r=pstmt.executeUpdate();
			System.out.println(r);
			if(r>0)
			{
				System.out.println("Update successfully...");
			}
			else
			{
				System.err.println("failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
