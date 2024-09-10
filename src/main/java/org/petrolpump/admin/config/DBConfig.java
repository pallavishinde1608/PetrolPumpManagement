package org.petrolpump.admin.config;

import java.sql.*;

public class DBConfig {
	 protected PreparedStatement stmt;
	    protected Connection conn;
	    protected ResultSet rs;
	    
	    public DBConfig(){
	    	try {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpump","root","pallavi");
	    	}
	    	catch(Exception ex)
	    	{
	    		System.out.println("Error is "+ex);
	    	}
	    }

}
