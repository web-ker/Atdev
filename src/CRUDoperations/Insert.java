package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;  

public class Insert 
{
	   static final String URL = "jdbc:mysql://localhost/rajesh";
	   static final String USER = "root";
	   static final String PASS = "webker";

	   public static void main(String[] args) 
	   {
	      try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
	         Statement stmt = conn.createStatement();) 
	      {		      
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO STUDENT VALUES (43, 'Rajesh','1999-05-24','2018-07-13')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO STUDENT VALUES (05, 'AMIT','2000-05-21','2018-07-14')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO STUDENT VALUES (31, 'Mayur','1999-12-18','2018-07-11')";
	         stmt.executeUpdate(sql); 
	         sql = "INSERT INTO STUDENT VALUES (21, 'Mayur','1999-04-07','2018-07-12')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO STUDENT VALUES (46, 'Onkar','2000-07-07','2018-07-14')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO STUDENT VALUES (08, 'Akshay','2000-01-27','2018-07-13')";
	         stmt.executeUpdate(sql);
	      } 
	      catch (SQLException e) 
	      {
	         e.printStackTrace();
	      } 
	   }
}