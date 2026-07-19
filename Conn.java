package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con;
		 
		 try
		 {
			 String url="jdbc:postgresql://localhost:5432/demostud";
			 String unm="postgres";
			 String pwd="Sam1625";
			 con=DriverManager.getConnection(url,unm,pwd);
			 System.out.println("Connection successfull.....");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }

		

	}

}
