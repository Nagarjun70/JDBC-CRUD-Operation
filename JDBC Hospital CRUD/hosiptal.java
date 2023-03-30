package com.jsp.hosiptal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class hosiptal 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hosiptaldet","root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into hosiptal values(?,?,?,?)");
			preparedStatement.setInt(1, 106);
			preparedStatement.setString(2, "Shiva");
			preparedStatement.setString(3, "www.shiva.com");
			preparedStatement.setString(4, "Karawr");
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
