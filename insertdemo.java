package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertdemo {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		
		try
		{
			String url="jdbc:postgresql://localhost:5432/demostud";
			String unm="postgres";
			String pwd="Sam1625";
			con=DriverManager.getConnection(url, unm, pwd);
			System.out.println("connected");
			String sql="insert into student (sname, age)values (?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "sarthak");
			pstmt.setInt(2, 13);
			int r= pstmt.executeUpdate();
			System.out.println(r);
			if (r>0)
			{
				System.out.println("Insert success");
			}
			else
			{
				System.out.println("Insert failed");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
