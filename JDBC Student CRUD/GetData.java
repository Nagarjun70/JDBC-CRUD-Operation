package com.jsp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class GetData 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdet", "root", "root");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from student ");
			while(resultSet.next())
			{
				System.out.println("Student ID is: "+resultSet.getInt(1));
				System.out.println("Student name is: "+resultSet.getString(2));
				System.out.println("Student age is: "+resultSet.getInt(3));
				System.out.println("Student gender is: "+resultSet.getString(4));
				System.out.println("******************************************");
			}
			connection.close();
			System.out.println("Data Retrived");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
