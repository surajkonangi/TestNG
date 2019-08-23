package jdbctestng;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	/**
	* purpose:jdbc connection from eclipse to mssql server.
	*/

	public class testngconnect {
	private Connection con;
	private static Statement st;
	private static ResultSet rs;

	@BeforeMethod
	void setup() throws Exception {

	// To register or load jdbc driver.
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	/**
	* URL to establish the connection. ServerName:ATMECSINDT-083\\SQLEXPRESS.
	* Database Name:Student Integratedsecurity:true which means it takes windows
	* account credential.
	*/
	String connectionUrl = "jdbc:sqlserver://ATMECSINLT-013\\SQLEXPRESS;database=master;integratedSecurity=true;";

	@SuppressWarnings("unused")
	// To establish the connection.
	Connection con = DriverManager.getConnection(connectionUrl);
	System.out.println("Connected to the Database...");
	st = con.createStatement();
	rs = st.executeQuery("select * from staff");
	}

	   /**
	    * Get student information from master database.
	    */
	@Test
	void getmasterData() throws SQLException {

	//st = con.createStatement();
	//rs = st.executeQuery("select * from staff");

	while (rs.next()) {
		int staff_id = rs.getInt(1);
		int staff_age = rs.getInt(2);
		System.out.println(staff_id + " " + staff_age);
	}
	st.close();
	rs.close();
	}
	/**
	*Close the database
	*/

	@AfterMethod
	void closeDatabase() throws Exception {
	if (con != null) {
	System.out.println("closing the database...");
	con.close();
	}
	}

	}

