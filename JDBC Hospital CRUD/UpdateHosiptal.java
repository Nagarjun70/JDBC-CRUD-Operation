package com.jsp.hosiptal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateHosiptal 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hosiptaldet","root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("update hosiptal set HositalName=? where id=102");
			preparedStatement.setString(1, "ARJUN");
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Updated");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
