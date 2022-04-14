package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

	public class CreateTable
	{
		   static final String URL = "jdbc:mysql://localhost/rajesh";
		   static final String USER = "root";
		   static final String PASS = "webker";

		   public static void main(String[] args) 
		   {
		      try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
		         Statement stmt = conn.createStatement();) 
		      {		      
		          String sql = "CREATE TABLE STUDENT(Student_no int(5),Student_name text(30),Student_DOB date,Student_DOJ date)"; 

		         stmt.executeUpdate(sql);
		         System.out.println("Created table STUDENT in database rajesh ");   	  
		      } 
		      catch (SQLException e) 
		      {
		         e.printStackTrace();
		      } 
		   }
	}