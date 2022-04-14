package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayList
{
	   static final String URL = "jdbc:mysql://localhost/rajesh";
	   static final String USER = "root";
	   static final String PASS = "webker";
	   static final String QUERY = "SELECT Student_no, Student_name FROM STUDENT";

	   public static void main(String[] args) 
	   {
	      try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
	         Statement stmt = conn.createStatement();) 
	      {		      
	         ResultSet rs = stmt.executeQuery(QUERY);
	         System.out.println("List Of Students");
	         while(rs.next())
	         {
	        	System.out.println();
	        	System.out.print("Student no: " + rs.getInt("Student_no"));
	            System.out.print(",Student Name: " + rs.getString("Student_name"));
	         }
	         rs.close();
	      } 
	      catch (SQLException e) 
	      {
	         e.printStackTrace();
	      } 
	   }
}