package com.jsp.hosiptal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteHosiptal 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hosiptaldet","root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from hosiptal where id=?");
			preparedStatement.setInt(1, 106);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Deleted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
