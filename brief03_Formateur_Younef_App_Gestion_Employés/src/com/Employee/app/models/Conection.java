package com.Employee.app.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conection {
	
	Connection conn;
	Statement stat;
    ResultSet rs;
    PreparedStatement ps;
   
	public void Connect() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/GestionPersonnel", "root" , "");
			//System.out.println("ok");
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
