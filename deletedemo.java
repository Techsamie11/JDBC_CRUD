package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletedemo {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		
		try
		{
			String url="jdbc:postgresql://localhost:5432/demostud";
			String unm="postgres";
			String pwd="Sam1625";
			con=DriverManager.getConnection(url, unm, pwd);
			System.out.println("Enter id :");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String sql="delete from student where id="+id;
			
			pstmt=con.prepareStatement(sql);
			int r=pstmt.executeUpdate();
			if (r>0)
			{
				System.out.println("delete succesfully");
			}
			else {
				System.out.println("Delete failed");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
